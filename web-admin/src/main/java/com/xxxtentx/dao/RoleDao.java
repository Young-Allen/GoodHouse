package com.xxxtentx.dao;

import com.xxxtentx.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xxxtentx
 * @version 1.0
 */
@Repository
public interface RoleDao {
    List<Role> findAll();
}
