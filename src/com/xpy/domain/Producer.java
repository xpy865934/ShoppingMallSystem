package com.xpy.domain;

public class Producer {
	private Long proId;
	private String proName;
	private String proAddress;
	private String proTel;
	private Integer version;

	public Long getProId() {
		return proId;
	}

	public void setProId(Long proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProAddress() {
		return proAddress;
	}

	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}

	public String getProTel() {
		return proTel;
	}

	public void setProTel(String proTel) {
		this.proTel = proTel;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
