package com.siims.vmaque.timePlus.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timenode.data.Picture;
import com.siims.vmaque.timePlus.timenode.service.PictureService;
import com.siims.vmaque.timePlus.wrapper.CreatePicWrapper;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class UploadImgAction extends StrutsAction{

	private File upload;
	private String uploadContentType;
	private String uploadFileName;

	public void uploadImage() throws Exception {
		// TODO Auto-generated method stub
		String nodeId = request.getParameter("nodeId");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (nodeId == null || nodeId.equals("")) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}else {
			File file = new File(ServletActionContext.getServletContext().getRealPath("/uploadImg"));
			if (!file.exists()) {
				file.mkdir();
				System.out.println("not exist");
			}else {
				System.out.println("exist");
			}
			FileOutputStream fos = new FileOutputStream(ServletActionContext.getServletContext().getRealPath("/uploadImg")+File.separator+getUploadFileName());
			FileInputStream fis = new FileInputStream(getUpload());
			byte[] buffer = new byte[1024];
			int len=0;
			while ((len = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}
			String path = "http://localhost:8088/uploadImg"+File.separator+getUploadFileName();
			Picture picture = ServiceContext.get(PictureService.class).createPic(nodeId, path);
			CreatePicWrapper wrapper = new CreatePicWrapper("success", picture);
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(wrapper));
		}
	}
	
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
}
