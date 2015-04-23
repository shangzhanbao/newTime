package com.siims.vmaque.timePlus.wrapper;

import java.util.List;

import com.siims.vmaque.timePlus.timeaxis.data.Axis;

public class GetAllAxisByUseridWrapper {
	
	private String result;
	private List<Axis> list;
	
	public GetAllAxisByUseridWrapper() {
		// TODO Auto-generated constructor stub
	}

	public GetAllAxisByUseridWrapper(String result, List<Axis> list) {
		super();
		this.result = result;
		this.list = list;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<Axis> getList() {
		return list;
	}

	public void setList(List<Axis> list) {
		this.list = list;
	}

}
