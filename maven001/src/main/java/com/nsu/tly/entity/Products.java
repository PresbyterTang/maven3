package com.nsu.tly.entity;

import java.sql.Timestamp;

/**
 * Products entity. @author MyEclipse Persistence Tools
 */

public class Products implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String productId;
	private Double price;
	private String unit;
	private String brand;
	private String category;
	private Integer pnum;
	private String imgurl;
	private String description;
	private Integer isHot;
	private Integer isNew;
	private Integer isCompetitive;
	private Timestamp launchTime;
	private Timestamp lastUpdateTime;

	// Constructors

	/** default constructor */
	public Products() {
	}

	/** minimal constructor */
	public Products(String name, String productId, Double price) {
		this.name = name;
		this.productId = productId;
		this.price = price;
	}

	/** full constructor */
	public Products(String name, String productId, Double price, String unit, String brand, String category,
			Integer pnum, String imgurl, String description, Integer isHot, Integer isNew, Integer isCompetitive,
			Timestamp launchTime, Timestamp lastUpdateTime) {
		this.name = name;
		this.productId = productId;
		this.price = price;
		this.unit = unit;
		this.brand = brand;
		this.category = category;
		this.pnum = pnum;
		this.imgurl = imgurl;
		this.description = description;
		this.isHot = isHot;
		this.isNew = isNew;
		this.isCompetitive = isCompetitive;
		this.launchTime = launchTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPnum() {
		return this.pnum;
	}

	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}

	public String getImgurl() {
		return this.imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIsHot() {
		return this.isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getIsNew() {
		return this.isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsCompetitive() {
		return this.isCompetitive;
	}

	public void setIsCompetitive(Integer isCompetitive) {
		this.isCompetitive = isCompetitive;
	}

	public Timestamp getLaunchTime() {
		return this.launchTime;
	}

	public void setLaunchTime(Timestamp launchTime) {
		this.launchTime = launchTime;
	}

	public Timestamp getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}