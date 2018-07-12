package com.winter.mapper;

import com.winter.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper
{
    int insert(Order order);
}
