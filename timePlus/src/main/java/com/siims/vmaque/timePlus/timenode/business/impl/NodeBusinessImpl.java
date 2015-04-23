package com.siims.vmaque.timePlus.timenode.business.impl;

import java.util.List;

import com.google.inject.Singleton;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.vmaque.timePlus.timenode.business.NodeBusiness;
import com.siims.vmaque.timePlus.timenode.data.Node;
import com.siims.vmaque.timePlus.timenode.persistence.NodePersistence;

@Singleton
@AutoBind(bindClass=NodeBusiness.class)
public class NodeBusinessImpl implements NodeBusiness{

	@Override
	public String createNode(String type,String name,String time,String loca,String phone, String desc,String axisId ) {
		// TODO Auto-generated method stub
		return ServiceContext.get(NodePersistence.class).createNode(type, name, time, loca, phone, desc, axisId);
	}

	@Override
	public void deleteNode(String nodeId) {
		// TODO Auto-generated method stub
		ServiceContext.get(NodePersistence.class).deleteNode(nodeId);
	}

	@Override
	public Node getNodeById(String id) {
		// TODO Auto-generated method stub
		return ServiceContext.get(NodePersistence.class).getNodeById(id);
	}

	@Override
	public void updateTC(String nodeId, String title, String content) {
		// TODO Auto-generated method stub
		ServiceContext.get(NodePersistence.class).updateTC(nodeId, title, content);
	}

	@Override
	public List<Node> getAllNodesByAxisId(String axisId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(NodePersistence.class).getAllNodesByAxisId(axisId);
	}

}
