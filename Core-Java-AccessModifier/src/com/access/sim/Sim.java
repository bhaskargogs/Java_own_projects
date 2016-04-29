package com.access.sim;

public class Sim {
	protected String name;
	protected String model;
	protected int quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Sim [name=" + name + ", model=" + model +", quantity="+getSims()+ "]";
	}
	
	protected int getSims() {
		return quantity;
	}
}
