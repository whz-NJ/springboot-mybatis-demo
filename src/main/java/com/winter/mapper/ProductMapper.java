package com.winter.mapper;

import com.winter.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper
{
    int update(Order order);
}
