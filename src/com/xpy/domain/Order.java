package com.xpy.domain;

import java.util.Date;

public class Order {
	private Long orderId;
	private Long userId;
	private Long goodId;
	private String rAddress;
	private String spDate;
	private Integer spCount;
	private Integer gPrice;
	private Long receiptID;
	private Integer spPrice;
	private Date sendTime;
	private String payment;
	private String sendType;
	private Integer sendPrice;
	private Long state;
	private Integer version;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGoodId() {
		return goodId;
	}

	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}

	public String getrAddress() {
		return rAddress;
	}

	public void setrAddress(String rAddress) {
		this.rAddress = rAddress;
	}

	public String getSpDate() {
		return spDate;
	}

	public void setSpDate(String spDate) {
		this.spDate = spDate;
	}

	public Integer getSpCount() {
		return spCount;
	}

	public void setSpCount(Integer spCount) {
		this.spCount = spCount;
	}

	public Integer getgPrice() {
		return gPrice;
	}

	public void setgPrice(Integer gPrice) {
		this.gPrice = gPrice;
	}

	public Long getReceiptID() {
		return receiptID;
	}

	public void setReceiptID(Long receiptID) {
		this.receiptID = receiptID;
	}

	public Integer getSpPrice() {
		return spPrice;
	}

	public void setSpPrice(Integer spPrice) {
		this.spPrice = spPrice;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public Integer getSendPrice() {
		return sendPrice;
	}

	public void setSendPrice(Integer sendPrice) {
		this.sendPrice = sendPrice;
	}

	public Long getState() {
		return state;
	}

	public void setState(Long state) {
		this.state = state;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
