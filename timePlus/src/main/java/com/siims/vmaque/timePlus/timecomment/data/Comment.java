package com.siims.vmaque.timePlus.timecomment.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.siims.framework.base.BaseData;

@Entity
@Table(name="MY_TIME_COMMENT")
public class Comment implements BaseData{

	@Id
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	@Column(name = "T_COMMENT_ID", length = 32, nullable = false)
	private String id;
	
	@Column(name="T_COMMENT_NAME")
	private String name;
	
	@Column(name="T_COMMENT_TIME")
	private String time;
	
	@Column(name="T_COMMENT_CONTENT")
	private String content;
	
	@Column(name="T_COMMENT_NODEID")
	private String nodeId;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	
	public Comment(String name, String content,String nodeId) {
		super();
		this.name = name;
		this.time = new Date().toString();
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
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