package com.siims.vmaque.timePlus.wrapper;

import java.util.ArrayList;
import java.util.List;

import com.siims.vmaque.timePlus.timenode.data.Node;

public class GetAllNodesByAxisIdWrapper {

	private String result;
	
	private List<Node> nodes = new ArrayList<Node>();
	
	public GetAllNodesByAxisIdWrapper() {
		// TODO Auto-generated constructor stub
	}

	public GetAllNodesByAxisIdWrapper(String result, List<Node> nodes) {
		super();
		this.result = result;
		this.nodes = nodes;
	}
	
}
