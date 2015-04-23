package com.siims.vmaque.timePlus.timeaxis.service.impl;

import java.util.List;

import com.google.inject.Singleton;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.framework.transaction.TransactionalContext;
import com.siims.vmaque.timePlus.timeaxis.business.AxisBusiness;
import com.siims.vmaque.timePlus.timeaxis.data.Axis;
import com.siims.vmaque.timePlus.timeaxis.service.AxisService;

@Singleton
@AutoBind(bindClass=AxisService.class)
@TransactionalContext
public class AxisServiceImpl implements AxisService {

	@Override
	public String createAxis(String userId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisBusiness.class).createAxis(userId);
	}

	@Override
	public void deleteAxis(String id) {
		// TODO Auto-generated method stub
		ServiceContext.get(AxisBusiness.class).deleteAxis(id);
	}

	@Override
	public void updateAxisPublished(String id, String name, String advertisement,String goodsId) {
		// TODO Auto-generated method stub
		ServiceContext.get(AxisBusiness.class).updateAxisPublished(id, name, advertisement, goodsId);
	}

	@Override
	public List<Axis> getAllAxisByUserid(String userId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisBusiness.class).getAllAxisByUserid(userId);
	}

	@Override
	public void updateAxisPraiseNum(String id) {
		// TODO Auto-generated method stub
		ServiceContext.get(AxisBusiness.class).updateAxisPraiseNum(id);
	}

	@Override
	public String getAxisComputerUrl(String userId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisBusiness.class).getAxisComputerUrl(userId);
	}

	@Override
	public String getAxisPhoneUrl(String userId) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisBusiness.class).getAxisPhoneUrl(userId);
	}
	
	public Axis getAxisById(String id) {
		// TODO Auto-generated method stub
		return ServiceContext.get(AxisBusiness.class).getAxisById(id);
	}

	@Override
	public void updateVisitNum(String id) {
		// TODO Auto-generated method stub
		ServiceContext.get(AxisBusiness.class).updateVisitNum(id);
	}
}
