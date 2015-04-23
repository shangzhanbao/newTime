package com.siims.vmaque.timePlus.wrapper;

import com.siims.vmaque.timePlus.timeaxis.data.Axis;

public class GetAxisByIdWrapper {
	
	private String result;
	private Axis axis;
	
	public GetAxisByIdWrapper() {
		// TODO Auto-generated constructor stub
	}
	
	public GetAxisByIdWrapper(String result, Axis axis) {
		super();
		this.result = result;
		this.axis = axis;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Axis getAxis() {
		return axis;
	}
	public void setAxis(Axis axis) {
		this.axis = axis;
	}
	
}
