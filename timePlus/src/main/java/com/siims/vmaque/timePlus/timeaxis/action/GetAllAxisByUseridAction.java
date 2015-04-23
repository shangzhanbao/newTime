package com.siims.vmaque.timePlus.timeaxis.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.support.AxisInfo;
import com.siims.vmaque.timePlus.timeaxis.data.Axis;
import com.siims.vmaque.timePlus.timeaxis.service.AxisService;
import com.siims.vmaque.timePlus.util.AxisSorter;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;
import com.siims.vmaque.timePlus.wrapper.GetAllAxisByUseridWrapper;

public class GetAllAxisByUseridAction extends StrutsAction{
		
	private String userId;
	
	public void getAllAxisByUserid() throws IOException {
		
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (userId.equals("") || userId == null) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));	
		} else {
			List<Axis> list = ServiceContext.get(AxisService.class).getAllAxisByUserid(userId); 
			GetAllAxisByUseridWrapper warpper = new GetAllAxisByUseridWrapper("success", list);
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}









