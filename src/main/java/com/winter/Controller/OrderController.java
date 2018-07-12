package com.winter.Controller;

import com.winter.model.Order;
import com.winter.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author whz
 * @create 2018-07-12 20:22
 * @desc ww
 **/
@Controller
@RequestMapping(value = "/order")
public class OrderController
{
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public void test1()
    {
        System.out.println("===============================test1 start");
        Order order = new Order();
        order.setProductId(1002);
        order.setCustomer("Five");
        order.setNumber(1);
        orderService.shopping(order);
        System.out.println("===============================test1 end");
    }
}