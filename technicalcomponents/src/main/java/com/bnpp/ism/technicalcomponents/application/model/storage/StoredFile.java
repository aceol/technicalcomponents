package com.bnpp.ism.technicalcomponents.application.model.storage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StoredFile {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;	
	@Column
	String name;	
	@Column
	String fileType;

	@OneToMany(mappedBy="file")
	List<StoredFileVersion> versions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	

	public List<StoredFileVersion> getVersions() {
		return versions;
	}

	public void setVersions(List<StoredFileVersion> versions) {
		this.versions = versions;
	}

	public void addVersion(StoredFileVersion version) {
		if (getVersions() == null) {
			this.versions = new ArrayList<StoredFileVersion>();
		}
		getVersions().add(version);
	}

}
