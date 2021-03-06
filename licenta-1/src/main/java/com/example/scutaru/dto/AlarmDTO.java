package com.example.scutaru.dto;

import java.io.Serializable;

public class AlarmDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String alarmLabel;
	private String generatingEntity;
	private String generatingValue;

	public AlarmDTO() {
		super();
	}

	public String getAlarmLabel() {
		return alarmLabel;
	}

	public void setAlarmLabel(String alarmLabel) {
		this.alarmLabel = alarmLabel;
	}

	public String getGeneratingEntity() {
		return generatingEntity;
	}

	public void setGeneratingEntity(String generatingEntity) {
		this.generatingEntity = generatingEntity;
	}

	public String getGeneratingValue() {
		return generatingValue;
	}

	public void setGeneratingValue(String generatingValue) {
		this.generatingValue = generatingValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AlarmDTO [id=" + id + ", alarmLabel=" + alarmLabel + ", generatingEntity=" + generatingEntity
				+ ", generatingValue=" + generatingValue + "]";
	}

}
