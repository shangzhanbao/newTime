package com.siims.vmaque.timePlus.timecomment.service;

import java.util.List;

import com.siims.framework.base.BaseService;
import com.siims.vmaque.timePlus.timecomment.data.Comment;

public interface CommentService extends BaseService {

	public String createComment(String name ,String content, String nodeId);
	public List<Comment> getAllCommentsByNodeId(String id);
	
}
