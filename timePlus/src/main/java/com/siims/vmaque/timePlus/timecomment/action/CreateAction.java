package com.siims.vmaque.timePlus.timecomment.action;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timecomment.service.CommentService;
import com.siims.vmaque.timePlus.wrapper.CreateCommentWrapper;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class CreateAction extends StrutsAction{
	
	public void createComment() throws IOException {
		String name = request.getParameter("name");
		String nodeId = request.getParameter("nodeId");
		String content = request.getParameter("content");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (name == null || name.equals("") || nodeId == null || nodeId.equals("") || content == null || content.equals("")) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}else {
			String commentId = ServiceContext.get(CommentService.class).createComment(name, content, nodeId);
			CreateCommentWrapper warpper = new CreateCommentWrapper("success", commentId);
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}
	}
}
