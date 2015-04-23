package com.siims.vmaque.timePlus.timenode.persistence;

import java.util.List;

import com.siims.framework.base.BasePersistence;
import com.siims.vmaque.timePlus.timenode.data.Picture;

public interface PicturePersistence extends BasePersistence<Picture> {
	
	public Picture createPic(String url, String desc);
	public List<Picture> getAllPicsByNodeId(String nodeId);
	public void	deletePic(String picId);
}
