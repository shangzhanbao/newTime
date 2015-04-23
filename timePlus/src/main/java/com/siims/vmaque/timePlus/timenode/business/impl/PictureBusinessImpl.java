package com.siims.vmaque.timePlus.timenode.business.impl;

import java.util.List;

import com.google.inject.Singleton;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.vmaque.timePlus.timenode.business.PictureBusiness;
import com.siims.vmaque.timePlus.timenode.data.Picture;
import com.siims.vmaque.timePlus.timenode.persistence.PicturePersistence;

@Singleton
@AutoBind(bindClass=PictureBusiness.class)
public class PictureBusinessImpl implements PictureBusiness {

	@Override
	public Picture createPic(String url, String desc) {
		// TODO Auto-generated method stub
		return ServiceContext.get(PicturePersistence.class).createPic(url, desc);
	}

	@Override
	public List<Picture> getAllPicsByNodeId(String nodeId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(PicturePersistence.class).getAllPicsByNodeId(nodeId);
	}

	@Override
	public void deletePic(String picId) {
		// TODO Auto-generated method stub
		ServiceContext.get(PicturePersistence.class).deletePic(picId);
	}

}
