package bLayeredDemo.entities.concreet;

import bLayeredDemo.entities.Abstracs.Entity;

public class Product implements Entity{
	private int id;
	private int categoryName;
	private String name;
	private double unitPrice;
	private int unitStock;
	
	public Product() {
		
	}

	public Product(int id, int categoryName, String name, double unitPrice, int unitStock) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitStock = unitStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(int categoryName) {
		this.categoryName = categoryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitStock() {
		return unitStock;
	}

	public void setUnitStock(int unitStock) {
		this.unitStock = unitStock;
	}
}
