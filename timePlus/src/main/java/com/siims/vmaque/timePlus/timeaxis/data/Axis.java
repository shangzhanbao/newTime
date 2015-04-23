package com.siims.vmaque.timePlus.timeaxis.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import com.siims.framework.base.BaseData;
import com.siims.vmaque.timePlus.timecomment.data.Comment;
import com.siims.vmaque.timePlus.timenode.data.Node;

@Entity
@Table(name="MY_TIME_AXIS")
public class Axis implements BaseData {
	
	@Id
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	@Column(name = "T_AXIS_ID", length = 32, nullable = false)
	private String id;
	
	@Column(name="T_AXIS_ISPUBLISHED")
	private String isPulished;
	
	@Column(name="T_AXIS_ADVERTISEMENT")
	private String advertisement;
	
	@Column(name="T_AXIS_NAME")
	private String name;
	
	@Column(name="T_AXIS_TIME")
	private Date time;
	
	@Column(name="T_AXIS_PRAISENUM")
	private Integer praiseNum;
	
	@Column(name="T_AXIS_VISITNUM")
	private Integer visitNum;
	
	@Column(name="T_AXIS_USERID")
	private String userId;
	
	@Column(name="T_AXIS_GOODID")
	private String goodId;
	
	@Column(name="T_AXIS_EWCODE")
	private String ewcode;
	
	public Axis() {
		// TODO Auto-generated constructor stub
	}
	
	public Axis(String userId) {
		super();
		this.isPulished = "0";
		this.advertisement = "";
		this.name = "";
		this.time = new Date();
		this.praiseNum = 0;
		this.visitNum = 0;
		this.userId = userId;
		this.goodId = "";
		this.ewcode="";
	}

	public String getIsPulished() {
		return isPulished;
	}

	public void setIsPulished(String isPulished) {
		this.isPulished = isPulished;
	}

	public String getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(String advertisement) {
		this.advertisement = advertisement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getPraiseNum() {
		return praiseNum;
	}

	public void setPraiseNum(Integer praiseNum) {
		this.praiseNum = praiseNum;
	}

	public Integer getVisitNum() {
		return visitNum;
	}

	public void setVisitNum(Integer visitNum) {
		this.visitNum = visitNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGoodId() {
		return goodId;
	}

	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}

	public String getEwcode() {
		return ewcode;
	}

	public void setEwcode(String ewcode) {
		this.ewcode = ewcode;
	}

}