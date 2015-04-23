package com.siims.vmaque.timePlus.timenode.action;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timenode.service.NodeService;
import com.siims.vmaque.timePlus.wrapper.CreateNodeWrapper;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;

public class CreateAction extends StrutsAction{
	
	public void createNode() throws IOException {
		String type = request.getParameter("type");	
		String name = request.getParameter("name");
		String time = request.getParameter("time");
		String loca = request.getParameter("loca");
		String phone = request.getParameter("phone");
		String desc = request.getParameter("desc");
		String axisId = request.getParameter("axisId");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (type == null || type.equals("") || name == null || name.equals("") || time == null || time.equals("")) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		}else {
			if (loca == null) {
				loca="";
			}
			if (phone == null) {
				phone="";
			}
			if (desc == null) {
				desc="";
			}
			String nodeId = ServiceContext.get(NodeService.class).createNode(type,name, time, loca, phone,desc, axisId );
			CreateNodeWrapper wrapper = new CreateNodeWrapper("success", nodeId);
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(wrapper));
		}
	}

}
