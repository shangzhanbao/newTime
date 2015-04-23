package com.siims.vmaque.timePlus.timeaxis.action;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timeaxis.service.AxisService;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class UpdatePraiseNumAction extends StrutsAction {

	private String axisId;
	
	public void updatePraiseNum() throws IOException {
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (axisId.equals("") || axisId == null) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));	
		}else {
			ServiceContext.get(AxisService.class).updateAxisPraiseNum(axisId);
			ErrorWrapper warpper = new ErrorWrapper("success");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}
	}

	public String getAxisId() {
		return axisId;
	}

	public void setAxisId(String axisId) {
		this.axisId = axisId;
	}
	
}
