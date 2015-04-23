package com.siims.vmaque.timePlus.timecomment.business;

import java.util.List;

import com.siims.framework.base.BaseBusiness;
import com.siims.vmaque.timePlus.timecomment.data.Comment;

public interface CommentBusiness extends BaseBusiness {

	public String createComment(String name ,String content, String nodeId);
	public List<Comment> getAllCommentsByNodeId(String id);
}
