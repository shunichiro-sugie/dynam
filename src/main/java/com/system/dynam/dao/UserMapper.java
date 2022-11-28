package com.system.dynam.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.system.dynam.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
	
}
