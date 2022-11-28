package com.system.dynam.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("t_user")
public class User  {
	private long id;
	
	private String email;
	
	private String password;
}
