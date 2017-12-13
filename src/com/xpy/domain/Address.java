package com.xpy.domain;

/**
 * 客户地址
 * 客户和地址关系是一对多关系
 * @author xpy
 *
 */
public class Address {
	private Long addressId;
	private String address;
	private Long userId;
	private Integer version;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
