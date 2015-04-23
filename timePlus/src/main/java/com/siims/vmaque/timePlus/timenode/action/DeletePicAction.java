package com.siims.vmaque.timePlus.timenode.action;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timenode.data.Picture;
import com.siims.vmaque.timePlus.timenode.service.NodeService;
import com.siims.vmaque.timePlus.timenode.service.PictureService;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class DeletePicAction extends StrutsAction {
	
	public void deletePic() throws IOException {
		String picId = request.getParameter("picId");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (picId == null || picId.equals("")) {
			ErrorWrapper wrapper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(wrapper));
		}else {
			ServiceContext.get(PictureService.class).deletePic(picId);
			ErrorWrapper wrapper = new ErrorWrapper("success");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(wrapper));
		}
	}

}
