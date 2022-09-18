package com.atguigu.controller;

import com.atguigu.entity.Role;
import com.atguigu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xxxtentx
 * @version 1.0
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping
    public String index(ModelMap model) {
        List<Role> list = roleService.findAll();

        model.addAttribute("list", list);
        return "role/index";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String asad() {
        return "asdad";
    }
}
