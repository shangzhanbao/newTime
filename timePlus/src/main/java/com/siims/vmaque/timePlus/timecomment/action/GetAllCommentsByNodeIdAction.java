package com.siims.vmaque.timePlus.timecomment.action;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timecomment.data.Comment;
import com.siims.vmaque.timePlus.timecomment.service.CommentService;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;
import com.siims.vmaque.timePlus.wrapper.GetAllCommentsByNodeIdWrapper;

public class GetAllCommentsByNodeIdAction extends StrutsAction{

	public void getAllCommentsByNodeId() throws IOException {
		String nodeId = request.getParameter("nodeId");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (nodeId == null ||  nodeId.equals("")) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}else {
			List<Comment> comments =  ServiceContext.get(CommentService.class).getAllCommentsByNodeId(nodeId);
			GetAllCommentsByNodeIdWrapper warpper = new GetAllCommentsByNodeIdWrapper("success", comments);
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}
	}
}
