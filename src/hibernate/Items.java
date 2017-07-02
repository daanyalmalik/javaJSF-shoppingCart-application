package hibernate;

import java.io.Serializable;

public class Items implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Products prod;
	private int quantity;
	
	
	public Products getProd() {
		return prod;
	}
	public void setProd(Products prod) {
		this.prod = prod;
	}
	
	
	public int getQunatity() {
		return quantity;
	}
	public void setQunatity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
