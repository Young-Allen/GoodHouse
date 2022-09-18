package com.atguigu.service;

import com.atguigu.dao.RoleDao;
import com.atguigu.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xxxtentx
 * @version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
