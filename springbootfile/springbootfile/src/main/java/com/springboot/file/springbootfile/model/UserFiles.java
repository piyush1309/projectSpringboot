package com.springboot.file.springbootfile.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_files")
public class UserFiles implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 892964065779188224L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="file_Name")
	private String fileName;
	@Column(name="modified_Filename")
	private String modifiedFilename;
	@Column(name="file_Extension")
	private String fileExtension;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getModifiedFilename() {
		return modifiedFilename;
	}
	public void setModifiedFilename(String modifiedFilename) {
		this.modifiedFilename = modifiedFilename;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
