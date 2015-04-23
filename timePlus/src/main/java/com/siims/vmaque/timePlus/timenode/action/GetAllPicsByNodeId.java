package com.siims.vmaque.timePlus.timenode.action;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timenode.data.Picture;
import com.siims.vmaque.timePlus.timenode.service.PictureService;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;
import com.siims.vmaque.timePlus.wrapper.GetAllPicsByNodeIdWrapper;

public class GetAllPicsByNodeId extends StrutsAction{

	public void getAllPicsByNodeId() throws IOException {
		
		String nodeId = request.getParameter("nodeId");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (nodeId == null || nodeId.equals("")) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}else {
			List<Picture> pictures = ServiceContext.get(PictureService.class).getAllPicsByNodeId(nodeId);
			GetAllPicsByNodeIdWrapper wrapper = new GetAllPicsByNodeIdWrapper("success", pictures);
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(wrapper));
		}
	}
}
