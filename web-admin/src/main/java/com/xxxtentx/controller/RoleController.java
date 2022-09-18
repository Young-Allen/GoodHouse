package com.xxxtentx.controller;

import com.xxxtentx.entity.Role;
import com.xxxtentx.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author xxxtentx
 * @version 1.0
 */
@Controller
public class RoleController {
    @Autowired
    @Qualifier("roleService")
    private RoleService roleService;

    @RequestMapping(value = "/role")
    @ResponseBody
    public String index(ModelMap model) {
        List<Role> list = roleService.findAll();
        model.addAttribute("list", list);
        return "/role/index";
    }

}
