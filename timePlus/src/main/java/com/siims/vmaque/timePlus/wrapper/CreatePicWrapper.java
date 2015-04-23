package com.siims.vmaque.timePlus.wrapper;

import com.siims.vmaque.timePlus.timenode.data.Picture;

public class CreatePicWrapper {

	private String result;
	private Picture picture;
	
	public CreatePicWrapper() {
		// TODO Auto-generated constructor stub
	}
		
	public CreatePicWrapper(String result, Picture picture) {
		super();
		this.result = result;
		this.picture = picture;
	}

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	
	
}
