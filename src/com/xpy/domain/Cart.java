package com.xpy.domain;

import java.util.Date;

/**
 * 购物车
 * 用户和购物车是一对一的关系
 * 购物车和商品是多对多的关系
 * @author xpy
 *
 */
public class Cart {
	private Long cartId;
	private Long userId;
	private Long goodId;
	private Date orderTime;
	private Integer orderCount;
	private Integer gPrice;
	private Integer userCheck;
	private Integer orderTotalPrice;
	private Integer version;

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
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

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Integer getgPrice() {
		return gPrice;
	}

	public void setgPrice(Integer gPrice) {
		this.gPrice = gPrice;
	}

	public Integer getUserCheck() {
		return userCheck;
	}

	public void setUserCheck(Integer userCheck) {
		this.userCheck = userCheck;
	}

	public Integer getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(Integer orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
