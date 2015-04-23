package com.siims.vmaque.timePlus.timenode.persistence;

import java.util.List;

import com.siims.framework.base.BasePersistence;
import com.siims.vmaque.timePlus.timenode.data.Node;

public interface NodePersistence extends BasePersistence<Node> {

	public String createNode(String type,String name,String time,String loca,String phone, String desc,String axisId );
	public void deleteNode(String nodeId);
	public Node getNodeById(String id);
	public void updateTC(String nodeId, String title, String content);
	public List<Node> getAllNodesByAxisId(String axisId);
}
