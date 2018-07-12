package com.winter.service.order.impl;

import com.winter.mapper.OrderMapper;
import com.winter.model.Order;
import com.winter.service.order.OrderService;
import com.winter.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author whz
 * @create 2018-07-12 18:36
 * @desc ww
 **/
@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired OrderMapper orderMapper;
    @Autowired ProductService productService;

    @Transactional
    @Override public int shopping(Order order)
    {
        System.out.println("===============enter shopping");
        int row = orderMapper.insert(order);

        System.out.println("============enter update product");
        productService.updateProduct(order);
        System.out.println("============exit update product");

        System.out.println("===============exit shopping");
        return row;
    }
}