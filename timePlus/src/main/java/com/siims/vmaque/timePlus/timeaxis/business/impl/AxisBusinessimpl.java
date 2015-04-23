package com.siims.vmaque.timePlus.timeaxis.business.impl;

import java.util.List;

import com.google.inject.Singleton;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.vmaque.timePlus.timeaxis.business.AxisBusiness;
import com.siims.vmaque.timePlus.timeaxis.data.Axis;
import com.siims.vmaque.timePlus.timeaxis.persistence.AxisPersistence;

@Singleton
@AutoBind(bindClass=AxisBusiness.class)
public class AxisBusinessimpl implements AxisBusiness {

	@Override
	public String createAxis(String userId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisPersistence.class).createAxis(userId);
	}

	@Override
	public void deleteAxis(String id) {
		// TODO Auto-generated method stub
		ServiceContext.get(AxisPersistence.class).deleteAxis(id);
	}

	@Override
	public void updateAxisPublished(String id, String name, String advertisement, String goodsId) {
		// TODO Auto-generated method stub
		ServiceContext.get(AxisPersistence.class).updateAxisPublished(id, name, advertisement, goodsId);
	}

	@Override
	public List<Axis> getAllAxisByUserid(String userId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisPersistence.class).getAllAxisByUserid(userId);
	}

	@Override
	public void updateAxisPraiseNum(String id) {
		// TODO Auto-generated method stub
		ServiceContext.get(AxisPersistence.class).updateAxisPraiseNum(id);
	}

	@Override
	public String getAxisComputerUrl(String userId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisPersistence.class).getAxisComputerUrl(userId);
	}

	@Override
	public String getAxisPhoneUrl(String userId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisPersistence.class).getAxisPhoneUrl(userId);
	}
	
	public Axis getAxisById(String id) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisPersistence.class).getAxisById(id);
	}

	@Override
	public void updateVisitNum(String id) {
		// TODO Auto-generated method stub
		ServiceContext.get(AxisPersistence.class).updateVisitNum(id);
	}

}
