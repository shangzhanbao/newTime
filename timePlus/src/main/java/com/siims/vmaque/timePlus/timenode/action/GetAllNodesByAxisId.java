package com.siims.vmaque.timePlus.timenode.action;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.mvc.struts.StrutsAction;
import com.siims.vmaque.timePlus.timenode.data.Node;
import com.siims.vmaque.timePlus.timenode.service.NodeService;
import com.siims.vmaque.timePlus.wrapper.ErrorWrapper;
import com.siims.vmaque.timePlus.wrapper.GetAllNodesByAxisIdWrapper;

public class GetAllNodesByAxisId extends StrutsAction{

	public void getAllNodesByAxisId() throws IOException {
		String axisId = request.getParameter("axisId");
		Gson gson = new GsonBuilder().serializeNulls().create();
		if (axisId == null || axisId.equals("")) {
			ErrorWrapper warpper = new ErrorWrapper("error");
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(warpper));
		} else {
			List<Node> nodes = ServiceContext.get(NodeService.class).getAllNodesByAxisId(axisId);
			GetAllNodesByAxisIdWrapper wrapper = new GetAllNodesByAxisIdWrapper("success", nodes);
			response.setContentType("application/text;charset=UTF-8"); 
			response.getWriter().write(gson.toJson(wrapper));
		}
	}
}
