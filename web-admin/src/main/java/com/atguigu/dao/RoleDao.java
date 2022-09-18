package com.atguigu.dao;

import com.atguigu.entity.Role;

import java.util.List;

/**
 * @author xxxtentx
 * @version 1.0
 */
public interface RoleDao {
    List<Role> findAll();
}
