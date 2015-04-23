package com.siims.vmaque.timePlus.wrapper;

public class CreateNodeWrapper {

	private String result;
	
	private String nodeId;

	public CreateNodeWrapper() {
		// TODO Auto-generated constructor stub
	}
		
	public CreateNodeWrapper(String result, String nodeId) {
		super();
		this.result = result;
		this.nodeId = nodeId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	
	
}
