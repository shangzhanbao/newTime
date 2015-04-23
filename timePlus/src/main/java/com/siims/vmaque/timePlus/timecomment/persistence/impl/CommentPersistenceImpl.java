package com.siims.vmaque.timePlus.timecomment.persistence.impl;

import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.siims.framework.base.BaseDao;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.vmaque.timePlus.timecomment.data.Comment;
import com.siims.vmaque.timePlus.timecomment.persistence.CommentPersistence;
import com.siims.vmaque.timePlus.timenode.data.Node;
import com.siims.vmaque.timePlus.timenode.service.NodeService;

@Singleton
@AutoBind(bindClass=CommentPersistence.class)
public class CommentPersistenceImpl implements CommentPersistence{

	private final BaseDao hibernatedao;
	
	@Inject
	protected CommentPersistenceImpl(@Named("hibernateDao") BaseDao hibernate) {
		this.hibernatedao = hibernate;
	}
	
	@Override
	public String createComment(String name, String content, String nodeId) {
		// TODO Auto-generated method stub
		Comment comment = new Comment(name, content, nodeId);
		hibernatedao.insert(null, comment);
		return comment.getId();
	}

	@Override
	public List<Comment> getAllCommentsByNodeId(String id) {
		// TODO Auto-generated method stub
		return hibernatedao.queryList("from Comment c where c.nodeId ='"+id+"'", null);
	}

}
