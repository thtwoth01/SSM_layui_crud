package com.lfy.demo.dao;

import java.util.List;

import com.lfy.demo.domain.User;

public interface UserDao {
    /** 查找所有用户 */
    List<User> listAll();
    
    /** 添加用户 */
    Integer insert(User user);
    
    /** 根据id删除用户 */
    Integer deleteById(Integer id);
    
    /** 更新用户 */
    Integer update(User user);
    
    /** 根据id查找用户 */
    User getById(Integer id);
}
