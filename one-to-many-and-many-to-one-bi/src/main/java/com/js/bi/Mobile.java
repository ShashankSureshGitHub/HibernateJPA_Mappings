package com.js.bi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String mobileName;
	private String brand;
	private double price;
	
	
	@OneToMany(mappedBy = "mobile", cascade = CascadeType.PERSIST)
	private List<Sim> sims;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Sim> getSims() {
		return sims;
	}

	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}

}
