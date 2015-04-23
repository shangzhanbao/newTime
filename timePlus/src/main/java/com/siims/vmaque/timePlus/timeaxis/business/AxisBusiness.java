package com.siims.vmaque.timePlus.timeaxis.business;

import java.util.List;

import com.siims.framework.base.BaseBusiness;
import com.siims.vmaque.timePlus.timeaxis.data.Axis;

public interface AxisBusiness extends BaseBusiness {

	public String createAxis(String userId);
	public void deleteAxis(String id);
	public void updateAxisPublished(String id, String name,String advertisement,String goodsId);
	public List<Axis> getAllAxisByUserid(String userId);
	public void updateAxisPraiseNum(String id);
	public String getAxisComputerUrl(String userId);
	public String getAxisPhoneUrl(String userId);
	public Axis getAxisById(String id);
	public void updateVisitNum(String id);
}
