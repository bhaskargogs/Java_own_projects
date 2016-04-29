package com.access.mobile;

import com.access.sim.Sim;

public class Mobile {
	private String name;
	private String model;
	private String vendor;
	private float price;
	protected Sim sim;
	private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", model=" + model + ", vendor=" + vendor + ", price=" + price + ", sim=" + sim
				+ "]";
	}
	
	
}
