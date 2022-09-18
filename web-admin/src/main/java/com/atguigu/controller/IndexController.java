package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xxxtentx
 * @version 1.0
 */
@Controller
public class IndexController {

    //去首页
    @RequestMapping("/")
    public String index() {
        return "frame/index";
    }

    @RequestMapping("/main")
    public String main() {
        return "frame/main";
    }
}
