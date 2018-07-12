package com.winter.model;

/**
 * @author whz
 * @create 2018-07-12 18:47
 * @desc ww
 **/
public class Product
{
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public Integer getCount()
    {
        return count;
    }

    public void setCount(Integer number)
    {
        this.count = number;
    }
    private Integer productId;
    private String productName;
    private Integer count;

    public Integer getProductId()
    {
        return productId;
    }

    public void setProductId(Integer productId)
    {
        this.productId = productId;
    }
}