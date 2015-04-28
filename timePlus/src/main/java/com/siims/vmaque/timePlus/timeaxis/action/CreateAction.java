package com.siims.vmaque.timePlus.timeaxis.action;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.framework.utils.ActionUtil;
import com.siims.vmaque.timePlus.timeaxis.service.AxisService;
import com.siims.vmaque.timePlus.wrapper.CreateAxisReplyWrapper;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class CreateAction extends StrutsAction{
	
	private String userId;
	
	public String createAxis() throws IOException {
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (userId.equals("") || userId == null) {
			ErrorWrapper warpper = new ErrorWrapper("error");
//			response.setContentType("application/text;charset=UTF-8"); 
//			response.getWriter().write(gson.toJson(warpper));
			ActionUtil.getRequest().setAttribute("wrapper", warpper);
			return SUCCESS;
		}else{
			String axisId = ServiceContext.get(AxisService.class).createAxis(userId);
			CreateAxisReplyWrapper warpper = new CreateAxisReplyWrapper("success", axisId);
//			response.setContentType("application/text;charset=UTF-8"); 
//			response.getWriter().write(gson.toJson(warpper));
			ActionUtil.getRequest().setAttribute("wrapper", warpper);
			return SUCCESS;
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
