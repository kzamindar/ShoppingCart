package com.shoppingcart.dao;

public class CartDao {
	private Integer id;
	private Integer userId;
	private Integer quantity;
	private Product product;
	
	public CartDao() {
		
	}
	
	public CartDao(Cart cart) {
		this.setId(cart.getId());
		this.setUserId(cart.getUserId());
		this.setQuantity(cart.getQuantity());
		this.setProduct(cart.getProduct());
		
	}
	
	@Override
	public String toString() {
		return "CartDao{"+"id="+id+",userId="+userId+",quantity="+quantity+",productName="+product.getName()+'}';
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
