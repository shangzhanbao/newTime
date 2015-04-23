package com.siims.vmaque.timePlus.timenode.service;

import java.util.List;

import com.siims.framework.base.BaseService;
import com.siims.vmaque.timePlus.timenode.data.Node;

public interface NodeService extends BaseService{

	public String createNode(String type,String name,String time,String loca,String phone, String desc,String axisId );
	public void deleteNode(String nodeId);
	public Node getNodeById(String id);
	public void updateTC(String nodeId, String title, String content);
	public List<Node> getAllNodesByAxisId(String axisId);
}
