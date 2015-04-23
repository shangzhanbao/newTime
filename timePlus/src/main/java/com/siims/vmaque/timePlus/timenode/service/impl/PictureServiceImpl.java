package com.siims.vmaque.timePlus.timenode.service.impl;

import java.util.List;

import com.google.inject.Singleton;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.framework.transaction.TransactionalContext;
import com.siims.vmaque.timePlus.timenode.business.PictureBusiness;
import com.siims.vmaque.timePlus.timenode.data.Picture;
import com.siims.vmaque.timePlus.timenode.service.PictureService;

@Singleton
@AutoBind(bindClass=PictureService.class)
@TransactionalContext
public class PictureServiceImpl implements PictureService{

	@Override
	public Picture createPic(String nodeId, String url) {
		// TODO Auto-generated method stub
		return ServiceContext.get(PictureBusiness.class).createPic(nodeId ,url);
	}

	@Override
	public List<Picture> getAllPicsByNodeId(String nodeId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(PictureBusiness.class).getAllPicsByNodeId(nodeId);
	}

	@Override
	public void deletePic(String picId) {
		// TODO Auto-generated method stub
		ServiceContext.get(PictureBusiness.class).deletePic(picId);
	}
}
