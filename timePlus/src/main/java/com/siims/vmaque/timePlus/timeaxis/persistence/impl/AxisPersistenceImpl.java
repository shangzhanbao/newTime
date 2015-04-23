package com.siims.vmaque.timePlus.timeaxis.persistence.impl;

import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.siims.framework.base.BaseDao;
import com.siims.framework.ioc.ServiceContext;
import com.siims.framework.ioc.guice.annotation.AutoBind;
import com.siims.vmaque.timePlus.timeaxis.data.Axis;
import com.siims.vmaque.timePlus.timeaxis.persistence.AxisPersistence;

@Singleton
@AutoBind(bindClass=AxisPersistence.class)
public class AxisPersistenceImpl implements AxisPersistence{

	private final BaseDao hibernatedao;
	
	@Inject
	protected AxisPersistenceImpl(@Named("hibernateDao") BaseDao hibernate) {
		this.hibernatedao = hibernate;
	}
	
	@Override
	public String createAxis(String userId) {
		// TODO Auto-generated method stub
		Axis axis = new Axis(userId);
		hibernatedao.insert(null, axis);
		return axis.getId();
	}

	@Override
	public void deleteAxis(String id) {
		// TODO Auto-generated method stub
		Axis axis = (Axis) hibernatedao.queryData(id, Axis.class);
		hibernatedao.delete(null, axis);
	}

	@Override
	public void updateAxisPublished(String id, String name, String advertisement, String goodsId) {
		// TODO Auto-generated method stub
		Axis axis = (Axis)hibernatedao.queryData(id, Axis.class);
		axis.setName(name);
		axis.setAdvertisement(advertisement);
		axis.setIsPulished("1");
		axis.setGoodId(goodsId);
		hibernatedao.update(null, axis);
	}

	@Override
	public List<Axis> getAllAxisByUserid(String userId) {
		// TODO Auto-generated method stub
		List<Axis> list = hibernatedao.queryList("from Axis a where a.userId = '" +userId+"'" ,null);
		return list;
	}

	@Override
	public void updateAxisPraiseNum(String id) {
		// TODO Auto-generated method stub
		Axis axis = (Axis)hibernatedao.queryData(id, Axis.class);
		axis.setPraiseNum(axis.getPraiseNum()+1);
		hibernatedao.update(null, axis);
	}

	@Override
	public String getAxisComputerUrl(String userId) {
		// TODO Auto-generated method stub
		Axis axis = (Axis)hibernatedao.queryData(userId, Axis.class);
		return "";
	}

	@Override
	public String getAxisPhoneUrl(String userId) {
		// TODO Auto-generated method stub
		Axis axis = (Axis)hibernatedao.queryData(userId, Axis.class);
		return "";
	}

	@Override
	public Axis getAxisById(String id) {
		// TODO Auto-generated method stub
		Axis axis = (Axis) hibernatedao.queryData(id, Axis.class);
		System.out.println(axis.getName());
		return axis;
	}

	@Override
	public void updateVisitNum(String id) {
		// TODO Auto-generated method stub
		Axis axis = (Axis) hibernatedao.queryData(id, Axis.class);
		axis.setVisitNum(axis.getVisitNum()+1);
		hibernatedao.update(null, axis);
	}
}
