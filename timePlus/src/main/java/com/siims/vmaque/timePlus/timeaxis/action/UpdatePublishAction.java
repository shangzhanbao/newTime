package com.siims.vmaque.timePlus.timeaxis.action;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timeaxis.service.AxisService;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class UpdatePublishAction extends StrutsAction{
	
	private String axisId;
	private String name;
	private String advertisement;
	
	public void publish() throws IOException {
		
		Gson gson = new GsonBuilder().serializeNulls().create();
		
		String goods = request.getParameter("goods");
		if (goods == null) {
			goods="3";
		}else if (goods.equals("")) {
			goods="4";
		}else{
			
		}
		if (axisId == null || axisId.equals("") || name==null || name.equals("") || advertisement==null || advertisement.equals("")) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}else {
			ServiceContext.get(AxisService.class).updateAxisPublished(axisId, name, advertisement,goods);
			ErrorWrapper warpper = new ErrorWrapper("success");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}
	}

	public String getAxisId() {
		return axisId;
	}

	public void setAxisId(String axisId) {
		this.axisId = axisId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(String advertisement) {
		this.advertisement = advertisement;
	}
	
}
