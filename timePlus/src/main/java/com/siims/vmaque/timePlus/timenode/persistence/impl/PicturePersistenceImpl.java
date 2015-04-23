package com.siims.vmaque.timePlus.timenode.persistence.impl;

import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.siims.framework.base.BaseDao;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.vmaque.timePlus.timenode.data.Picture;
import com.siims.vmaque.timePlus.timenode.persistence.PicturePersistence;

@Singleton
@AutoBind(bindClass=PicturePersistence.class)
public class PicturePersistenceImpl implements PicturePersistence{

	private final BaseDao hibernatedao;
	
	@Inject
	protected PicturePersistenceImpl(@Named("hibernateDao") BaseDao hibernate) {
		this.hibernatedao = hibernate;
	}
	
	@Override
	public Picture createPic(String nodeId, String url) {
		// TODO Auto-generated method stub
		Picture picture = new Picture(url, nodeId);
		hibernatedao.insert(null, picture);
		return picture;
	}

	@Override
	public List<Picture> getAllPicsByNodeId(String nodeId) {
		// TODO Auto-generated method stub
		return hibernatedao.queryList("from Picture p where p.nodeId = '"+nodeId+"'", null);
	}

	@Override
	public void deletePic(String picId) {
		// TODO Auto-generated method stub
		Picture picture = (Picture) hibernatedao.queryData(picId, Picture.class);
		hibernatedao.delete(null, picture);
	}

}
