package com.siims.vmaque.timePlus.timecomment.business.impl;

import java.util.List;

import com.google.inject.Singleton;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.vmaque.timePlus.timecomment.business.CommentBusiness;
import com.siims.vmaque.timePlus.timecomment.data.Comment;
import com.siims.vmaque.timePlus.timecomment.persistence.CommentPersistence;

@Singleton
@AutoBind(bindClass=CommentBusiness.class)
public class CommentBusinessImpl implements CommentBusiness {

	@Override
	public String createComment(String name, String content, String nodeId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(CommentPersistence.class).createComment(name, content, nodeId);
	}

	@Override
	public List<Comment> getAllCommentsByNodeId(String id) {
		// TODO Auto-generated method stub
		return ServiceContext.get(CommentPersistence.class).getAllCommentsByNodeId(id);
	}

}
