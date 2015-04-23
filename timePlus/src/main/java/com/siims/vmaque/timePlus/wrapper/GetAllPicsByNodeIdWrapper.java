package com.siims.vmaque.timePlus.wrapper;

import java.util.ArrayList;
import java.util.List;

import com.siims.vmaque.timePlus.timenode.data.Picture;

public class GetAllPicsByNodeIdWrapper {

	private String result;
	
	private List<Picture> pictures = new ArrayList<Picture>();
	
	public GetAllPicsByNodeIdWrapper() {
		// TODO Auto-generated constructor stub
	}

	public GetAllPicsByNodeIdWrapper(String result, List<Picture> pictures) {
		super();
		this.result = result;
		this.pictures = pictures;
	}
	
}
