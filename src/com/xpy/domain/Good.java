package com.xpy.domain;

import java.util.Date;

public class Good {
	private Long goodId;
	private String gName;
	private Integer gPrice;
	private Long gTypeID;
	private String gIntro;
	private String gImagePath;
	private Integer gCount;
	private Long gSail;
	private Long gWeight;
	private Date gDateTime;
	private String gSize;
	private Integer version;

	public Long getGoodId() {
		return goodId;
	}

	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public Integer getgPrice() {
		return gPrice;
	}

	public void setgPrice(Integer gPrice) {
		this.gPrice = gPrice;
	}

	public Long getgTypeID() {
		return gTypeID;
	}

	public void setgTypeID(Long gTypeID) {
		this.gTypeID = gTypeID;
	}

	public String getgIntro() {
		return gIntro;
	}

	public void setgIntro(String gIntro) {
		this.gIntro = gIntro;
	}

	public String getgImagePath() {
		return gImagePath;
	}

	public void setgImagePath(String gImagePath) {
		this.gImagePath = gImagePath;
	}

	public Integer getgCount() {
		return gCount;
	}

	public void setgCount(Integer gCount) {
		this.gCount = gCount;
	}

	public Long getgSail() {
		return gSail;
	}

	public void setgSail(Long gSail) {
		this.gSail = gSail;
	}

	public Long getgWeight() {
		return gWeight;
	}

	public void setgWeight(Long gWeight) {
		this.gWeight = gWeight;
	}

	public Date getgDateTime() {
		return gDateTime;
	}

	public void setgDateTime(Date gDateTime) {
		this.gDateTime = gDateTime;
	}

	public String getgSize() {
		return gSize;
	}

	public void setgSize(String gSize) {
		this.gSize = gSize;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
