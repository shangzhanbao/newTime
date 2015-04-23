package com.siims.vmaque.timePlus.timenode.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.siims.framework.base.BaseData;

@Entity
@Table(name="MY_TIME_PIC")
public class Picture implements BaseData{

	@Id
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	@Column(name = "T_PIC_ID", length = 32, nullable = false)
	private String id;
	
	@Column(name="T_PIC_URL")
	private String url;
	
	@Column(name="T_PIC_NODEID")
	private String nodeId;
	
	public Picture() {
		// TODO Auto-generated constructor stub
	}
	
	public Picture(String url, String nodeId) {
		super();
		this.url = url;
		this.nodeId = nodeId;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	
}