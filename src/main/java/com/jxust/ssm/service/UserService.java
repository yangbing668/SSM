package com.jxust.ssm.service;

import com.jxust.ssm.pojo.User;
/**
 * Service层接口
 * @author Pen
 * @Date
 */
public interface UserService {
	//根据id查找
	public User getUserById(Integer userid);
	
	//添加一条数据
	public int insert(User user);
}
