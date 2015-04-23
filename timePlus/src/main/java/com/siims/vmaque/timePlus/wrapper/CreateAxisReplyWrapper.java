package com.siims.vmaque.timePlus.wrapper;

public class CreateAxisReplyWrapper {
	
	private String result;
	private String axisId;
	
	public CreateAxisReplyWrapper() {
		// TODO Auto-generated constructor stub
	}

	public CreateAxisReplyWrapper(String result, String axisId) {
		super();
		this.result = result;
		this.axisId = axisId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getAxisId() {
		return axisId;
	}

	public void setAxisId(String axisId) {
		this.axisId = axisId;
	}
}
