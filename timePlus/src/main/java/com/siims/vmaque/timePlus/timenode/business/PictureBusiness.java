package com.siims.vmaque.timePlus.timenode.business;

import java.util.List;

import com.siims.framework.base.BaseBusiness;
import com.siims.vmaque.timePlus.timenode.data.Picture;

public interface PictureBusiness extends BaseBusiness{
	
	public Picture createPic(String nodeId, String url);
	public List<Picture> getAllPicsByNodeId(String nodeId);
	public void	deletePic(String picId);
}
