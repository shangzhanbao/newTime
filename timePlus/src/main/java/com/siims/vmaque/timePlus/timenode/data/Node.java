package com.siims.vmaque.timePlus.timenode.data;

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

@Entity
@Table(name="MY_TIME_NODE")
public class Node implements BaseData{

	@Id
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	@Column(name = "T_NODE_ID", length = 32, nullable = false)
	private String id;
	
	@Column(name="T_NODE_TYPE")
	private String type;
	
	@Column(name="T_NODE_NAME")
	private String name;
	
	@Column(name="T_NODE_TITLE")
	private String title;
	
	@Column(name="T_NODE_CONTENT")
	private String content;
	
	@Column(name="T_NODE_TIME")
	private String time;
	
	@Column(name="T_NODE_LOCA")
	private String loca;
	
	@Column(name="T_NODE_PHONE")
	private String phone;
	
	@Column(name="T_NODE_DESC")
	private String desc;
	
	@Column(name="T_NODE_NODETIME")
	private Date nodeTime;
	
	@Column(name="T_NODE_AXISID")
	private String axisId;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(String type, String name, String time, String loca, String phone, String desc,String axisId) {
		super();
		this.type = type;
		this.name = name;
		this.title = "";
		this.content = "";
		this.time = time;
		this.loca = loca;
		this.phone = phone;
		this.desc = desc;
		this.nodeTime = new Date();
		this.axisId = axisId;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLoca() {
		return loca;
	}

	public void setLoca(String loca) {
		this.loca = loca;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getNodeTime() {
		return nodeTime;
	}

	public void setNodeTime(Date nodeTime) {
		this.nodeTime = nodeTime;
	}

	public String getAxisId() {
		return axisId;
	}

	public void setAxisId(String axisId) {
		this.axisId = axisId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
