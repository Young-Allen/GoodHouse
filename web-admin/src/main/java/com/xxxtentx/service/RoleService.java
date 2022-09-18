package com.xxxtentx.service;

import com.xxxtentx.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xxxtentx
 * @version 1.0
 */
public interface RoleService {
    List<Role> findAll();
}
