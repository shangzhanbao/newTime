package com.siims.vmaque.timePlus.timenode.service;

import java.util.List;

import com.siims.framework.base.BaseService;
import com.siims.vmaque.timePlus.timenode.data.Picture;

public interface PictureService extends BaseService{

	public Picture createPic(String nodeId, String url);
	public List<Picture> getAllPicsByNodeId(String nodeId);
	public void deletePic(String picId);
	
}
