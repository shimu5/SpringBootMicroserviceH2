package com.spring.microservice.ec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Tour {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String title;
	
	@Column(length=2000)
	private String description;
	
	@Column(length=2000)
	String blurb;
	
	@Column
	private double price;
	
	@Column
	private String duration;
	
	@Column(length=2000)
	private String bullets;
	
	@Column(length=2000)
	private String keywords;
	
	@ManyToOne
	private TourPackage tourPackage;
	
	@Column
	@Enumerated
	private Difficulty difficulty;
	
	@Column
	@Enumerated
	private Region region;

	public Tour(String title, String description, String blurb, double price, String duration, String bullets,
			String keywords, TourPackage tourPackage, Difficulty difficulty,
			Region region) {
		super();
		this.title = title;
		this.description = description;
		this.blurb = blurb;
		this.price = price;
		this.duration = duration;
		this.bullets = bullets;
		this.keywords = keywords;
		this.tourPackage = tourPackage;
		this.difficulty = difficulty;
		this.region = region;
	}
	
	protected Tour() { //protected because consumer of this class can create fully initialized java object
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBlurb() {
		return blurb;
	}

	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getBullets() {
		return bullets;
	}

	public void setBullets(String bullets) {
		this.bullets = bullets;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public TourPackage getTourPackage() {
		return tourPackage;
	}

	public void setTourPackage(TourPackage tourPackage) {
		this.tourPackage = tourPackage;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	
}
