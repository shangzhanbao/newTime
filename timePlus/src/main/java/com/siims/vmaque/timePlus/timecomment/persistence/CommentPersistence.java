package com.siims.vmaque.timePlus.timecomment.persistence;

import java.util.List;

import com.siims.framework.base.BasePersistence;
import com.siims.vmaque.timePlus.timecomment.data.Comment;

public interface CommentPersistence extends BasePersistence<Comment>{

	public String createComment(String name ,String content, String nodeId);
	public List<Comment> getAllCommentsByNodeId(String id);
}
