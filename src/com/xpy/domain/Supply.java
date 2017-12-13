package com.xpy.domain;

public class Supply {
	private Long supId;
	private Integer realStock;
	private Integer MinStock;
	private Long goodId;
	private Long proId;
	private Integer version;

	public Long getSupId() {
		return supId;
	}

	public void setSupId(Long supId) {
		this.supId = supId;
	}

	public Integer getRealStock() {
		return realStock;
	}

	public void setRealStock(Integer realStock) {
		this.realStock = realStock;
	}

	public Integer getMinStock() {
		return MinStock;
	}

	public void setMinStock(Integer minStock) {
		MinStock = minStock;
	}

	public Long getGoodId() {
		return goodId;
	}

	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}

	public Long getProId() {
		return proId;
	}

	public void setProId(Long proId) {
		this.proId = proId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
