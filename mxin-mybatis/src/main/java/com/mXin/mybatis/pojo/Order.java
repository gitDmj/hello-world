package com.mXin.mybatis.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order")
public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "price")
	private int price;
	@Column(name = "create_time")
	private String createTime;
	@Column(name = "shop_id" )
	private int shopId;
	@Column(name = "status")
	private int status;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, int userId, int price, String createTime, int shop_id, int status) {
		super();
		this.id = id;
		this.userId = userId;
		this.price = price;
		this.createTime = createTime;
		this.shopId = shop_id;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getShop_id() {
		return shopId;
	}
	public void setShop_id(int shop_id) {
		this.shopId = shop_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", price=" + price + ", createTime=" + createTime
				+ ", shopId=" + shopId + ", status=" + status + "]";
	}
	
}
