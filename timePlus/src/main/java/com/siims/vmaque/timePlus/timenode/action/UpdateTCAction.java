package com.siims.vmaque.timePlus.timenode.action;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timenode.service.NodeService;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class UpdateTCAction extends StrutsAction{
	
	public void updateTC() throws IOException {
		String nodeId = request.getParameter("nodeId");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (nodeId==null || nodeId.equals("") || title == null || title.equals("") || content == null || content.equals("")) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}else {
			ServiceContext.get(NodeService.class).updateTC(nodeId, title, content);
			ErrorWrapper warpper = new ErrorWrapper("success");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}
	}

}
