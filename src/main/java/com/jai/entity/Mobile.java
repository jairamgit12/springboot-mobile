package com.jai.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "MBLES")
public class Mobile implements Serializable{
	
	private static final long serialVersionUID = 8019228209834805681L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "modelName", columnDefinition = "varchar(40)",nullable = false)
	private String modelName;
	@Column(name = "description", columnDefinition = "varchar(40)",nullable = false)
	private String description;
	@Column(name = "ramSize", columnDefinition = "varchar(40)",nullable = false)
	private String ramSize;
	@Column(name = "romSize", columnDefinition = "varchar(40)",nullable = false)
	private String romSize;
	@Column(name = "price",columnDefinition = "varchar(40)",nullable = false)
	private Float price;
	@Column(name = "color", columnDefinition = "varchar(40)",nullable = false)
	private String color;
	@Column(name = "weight", columnDefinition = "varchar(40)",nullable = false)
	private String weight;
	@Column(name = "batteryCapacity", columnDefinition = "varchar(40)",nullable = false)
	private String batteryCapacity;
	@Column(name = "status")
	private Boolean status;
	@Column(name = "screenSize", columnDefinition = "varchar(40)",nullable = false)
	private String screenSize;
	@Column(name = "os", columnDefinition = "varchar(40)",nullable = false)
	private String os;
	@Column(name = "processor", columnDefinition = "varchar(40)",nullable = false)
	private String processor;
	@Column(name = "rearCamera", columnDefinition = "varchar(40)",nullable = false)
	private String rearCamera;
	@Column(name = "frontCamera", columnDefinition = "varchar(40)",nullable = false)
	private String frontCamera;
	@Column(name = "bestReview", columnDefinition = "varchar(40)",nullable = false)
	private String bestReview;
	@Column(name = "rating", nullable = false)
	private Integer rating;
	@Column(name = "countryofOrigin", columnDefinition = "varchar(40)",nullable = false)
	private String CountryofOrigin;
	@Column(name = "dateFirstAvailable", columnDefinition = "varchar(40)",nullable = false)
	private String DateFirstAvailable;
	@CreationTimestamp
	@Column(name = "createDate")
	private Date createdDate;
	@UpdateTimestamp
	@Column(name = "modifiedDate")
	private Date modifiedDate;
	
	public Mobile() {
		
	}

	public Mobile(Integer id, String modelName, String description, String ramSize, String romSize, Float price,
			String color, String weight, String batteryCapacity, Boolean status, String screenSize, String os,
			String processor, String rearCamera, String frontCamera, String bestReview, Integer rating,
			String countryofOrigin, String dateFirstAvailable, Date createdDate, Date modifiedDate) {
		super();
		this.id = id;
		this.modelName = modelName;
		this.description = description;
		this.ramSize = ramSize;
		this.romSize = romSize;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.batteryCapacity = batteryCapacity;
		this.status = status;
		this.screenSize = screenSize;
		this.os = os;
		this.processor = processor;
		this.rearCamera = rearCamera;
		this.frontCamera = frontCamera;
		this.bestReview = bestReview;
		this.rating = rating;
		CountryofOrigin = countryofOrigin;
		DateFirstAvailable = dateFirstAvailable;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getRomSize() {
		return romSize;
	}

	public void setRomSize(String romSize) {
		this.romSize = romSize;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRearCamera() {
		return rearCamera;
	}

	public void setRearCamera(String rearCamera) {
		this.rearCamera = rearCamera;
	}

	public String getFrontCamera() {
		return frontCamera;
	}

	public void setFrontCamera(String frontCamera) {
		this.frontCamera = frontCamera;
	}

	public String getBestReview() {
		return bestReview;
	}

	public void setBestReview(String bestReview) {
		this.bestReview = bestReview;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getCountryofOrigin() {
		return CountryofOrigin;
	}

	public void setCountryofOrigin(String countryofOrigin) {
		CountryofOrigin = countryofOrigin;
	}

	public String getDateFirstAvailable() {
		return DateFirstAvailable;
	}

	public void setDateFirstAvailable(String dateFirstAvailable) {
		DateFirstAvailable = dateFirstAvailable;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", modelName=" + modelName + ", description=" + description + ", ramSize=" + ramSize
				+ ", romSize=" + romSize + ", price=" + price + ", color=" + color + ", weight=" + weight
				+ ", batteryCapacity=" + batteryCapacity + ", status=" + status + ", screenSize=" + screenSize + ", os="
				+ os + ", processor=" + processor + ", rearCamera=" + rearCamera + ", frontCamera=" + frontCamera
				+ ", bestReview=" + bestReview + ", rating=" + rating + ", CountryofOrigin=" + CountryofOrigin
				+ ", DateFirstAvailable=" + DateFirstAvailable + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}

	
	
}
