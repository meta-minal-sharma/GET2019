package com.metacube.training.model;

/**
 * productModel used to create entity of product
 * @author admin
 *
 */

public class ProductModel extends BaseEntity {

	private String pName;
	private double price;
	private String pCategory;

	public ProductModel(int id, String pName, double price, String pCategory) {
		super(id);
		this.pName = pName;
		this.price = price;
		this.pCategory = pCategory;
	}

	public ProductModel() {
		super();
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

}
