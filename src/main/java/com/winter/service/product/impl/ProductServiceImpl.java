package com.winter.service.product.impl;

import com.winter.mapper.ProductMapper;
import com.winter.model.Order;
import com.winter.model.Product;
import com.winter.service.product.ProductService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author whz
 * @create 2018-07-12 18:37
 * @desc ww
 **/
@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired ProductMapper productMapper;
    @Transactional
    @Override public int updateProduct(Order order)
    {
        System.out.println("============enter updateProduct");
        int row = productMapper.update(order);
        ProductService productService = (ProductService)AopContext.currentProxy();
        productService.sayHello();
        System.out.println("============exit updateProduct");
        return row;
    }
    @Transactional
    public void sayHello()
    {
        System.out.println("hello!");
    }
}