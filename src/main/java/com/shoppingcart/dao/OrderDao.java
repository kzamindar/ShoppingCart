package com.shoppingcart.dao;

public class OrderDao {
	private Integer id;
    private Integer userId;

    public OrderDao() {
    }

    public OrderDao(Order order) {
        this.setId(order.getId());
        //this.setUserId(order.getUserId());
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
}
