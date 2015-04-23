package com.siims.vmaque.timePlus.timenode.action;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timenode.service.NodeService;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class DeleteAction extends StrutsAction{
	
	public void deleteNode() throws IOException {
		String nodeId = request.getParameter("nodeId");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (nodeId == null || nodeId.equals("")) {
			ErrorWrapper wrapper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(wrapper));
		}else {
			ServiceContext.get(NodeService.class).deleteNode(nodeId);
			ErrorWrapper wrapper = new ErrorWrapper("success");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(wrapper));
		}
	}
}
