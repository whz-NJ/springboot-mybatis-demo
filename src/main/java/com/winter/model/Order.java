package com.winter.model;

/**
 * @author whz
 * @create 2018-07-12 18:45
 * @desc ww
 **/
public class Order
{
    private Integer productId;

    public Integer getProductId()
    {
        return productId;
    }

    public void setProductId(Integer productId)
    {
        this.productId = productId;
    }

    public String getCustomer()
    {
        return customer;
    }

    public void setCustomer(String customer)
    {
        this.customer = customer;
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

    private String customer;
    private Integer number;
}