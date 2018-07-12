package com.winter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;
import com.winter.Controller.OrderController;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.winter.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class SpringbootMybatisDemoApplicationTests {

	@Autowired OrderController orderController;
	@Test
	public void contextLoads() {
		orderController.test1();
	}

}
