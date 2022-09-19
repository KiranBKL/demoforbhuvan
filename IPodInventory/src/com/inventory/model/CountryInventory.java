package com.inventory.model;

public class CountryInventory {
	
	String name;
	int quantity;
	int price;
	int charges;
	
	
	public CountryInventory(String name, int quantity, int price, int charges) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.charges = charges;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "CountryInventory [name=" + name + ", quantity=" + quantity ;
	}
	
	
}
