package com.bnpp.ism.technicalcomponents.application.model.component;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ComponentVersionInfo {
	@Column
	private String name;
	@Column
	private String version;
	@Column
	private String description;
	
	@Column
	private Date availableDate;
	@Column
	private Date deprecatedDate;
	@Column
	private Date unavailableDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	public Date getDeprecatedDate() {
		return deprecatedDate;
	}
	public void setDeprecatedDate(Date deprecatedDate) {
		this.deprecatedDate = deprecatedDate;
	}
	public Date getUnavailableDate() {
		return unavailableDate;
	}
	public void setUnavailableDate(Date unvailableDate) {
		this.unavailableDate = unvailableDate;
	}
}
