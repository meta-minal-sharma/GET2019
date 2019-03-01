package com.metacube.training.model;

import java.util.HashMap;
import java.util.Map;

/**
 * cartModel used to create entity of cart
 * @author admin
 *
 */
public class CartModel {

	private Map<ProductModel, Integer> productsInCart;
	private double totalAmount;

	public CartModel() {

		this.productsInCart = new HashMap<ProductModel, Integer>();

	}

	public Map<ProductModel, Integer> getProductsInCart() {
		return productsInCart;
	}

	public void setProductsInCart(Map<ProductModel, Integer> productsInCart) {
		this.productsInCart = productsInCart;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
