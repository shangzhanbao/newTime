package com.siims.vmaque.timePlus.timenode.persistence.impl;

import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.siims.framework.base.BaseDao;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.vmaque.timePlus.timeaxis.data.Axis;
import com.siims.vmaque.timePlus.timeaxis.service.AxisService;
import com.siims.vmaque.timePlus.timenode.data.Node;
import com.siims.vmaque.timePlus.timenode.persistence.NodePersistence;
import com.siims.vmaque.timePlus.timenode.service.NodeService;

@Singleton
@AutoBind(bindClass=NodePersistence.class)
public class NodePersistenceImpl implements NodePersistence {

	private final BaseDao hibernatedao;
	
	@Inject
	protected NodePersistenceImpl(@Named("hibernateDao") BaseDao hibernate) {
		this.hibernatedao = hibernate;
	}
	
	@Override
	public String createNode(String type,String name,String time,String loca,String phone, String desc,String axisId ) {
		// TODO Auto-generated method stub
		Node node = new Node(type, name, time, loca, phone, desc, axisId);
		hibernatedao.insert(null, node);
		return node.getId();
	}

	@Override
	public void deleteNode(String nodeId) {
		// TODO Auto-generated method stub
		Node node = (Node) hibernatedao.queryData(nodeId, Node.class);
		hibernatedao.delete(null, node);
	}

	@Override
	public Node getNodeById(String id) {
		// TODO Auto-generated method stub
		return (Node) hibernatedao.queryData("from Node n where n.id = "+id, Node.class);
	}

	@Override
	public void updateTC(String nodeId, String title, String content) {
		// TODO Auto-generated method stub
		Node node = (Node)hibernatedao.queryData(nodeId, Node.class);
		node.setTitle(title);
		node.setContent(content);
		hibernatedao.update(null, node);
	}

	@Override
	public List<Node> getAllNodesByAxisId(String axisId) {
		// TODO Auto-generated method stub
		return hibernatedao.queryList("from Node n where n.axisId = '"+axisId+"'", null);
	}

}









