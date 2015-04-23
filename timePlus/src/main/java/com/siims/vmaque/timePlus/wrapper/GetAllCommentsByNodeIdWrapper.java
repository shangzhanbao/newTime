package com.siims.vmaque.timePlus.wrapper;

import java.util.ArrayList;
import java.util.List;

import com.siims.vmaque.timePlus.timecomment.data.Comment;

public class GetAllCommentsByNodeIdWrapper {

	private String result;
	private List<Comment> comments = new ArrayList<Comment>();
	
	public GetAllCommentsByNodeIdWrapper() {
		// TODO Auto-generated constructor stub
	}

	public GetAllCommentsByNodeIdWrapper(String result, List<Comment> comments) {
		super();
		this.result = result;
		this.comments = comments;
	}
	
}
