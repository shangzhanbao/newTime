package com.siims.vmaque.timePlus.timecomment.service.impl;

import java.util.List;

import com.google.inject.Singleton;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.framework.transaction.TransactionalContext;
import com.siims.vmaque.timePlus.timecomment.business.CommentBusiness;
import com.siims.vmaque.timePlus.timecomment.data.Comment;
import com.siims.vmaque.timePlus.timecomment.service.CommentService;

@Singleton
@AutoBind(bindClass=CommentService.class)
@TransactionalContext
public class CommentServiceImpl implements CommentService {

	@Override
	public String createComment(String name, String content, String nodeId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(CommentBusiness.class).createComment(name, content, nodeId);
	}

	@Override
	public List<Comment> getAllCommentsByNodeId(String id) {
		// TODO Auto-generated method stub
		return ServiceContext.get(CommentBusiness.class).getAllCommentsByNodeId(id);
	}

}
