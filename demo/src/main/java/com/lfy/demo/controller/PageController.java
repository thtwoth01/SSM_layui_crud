package com.lfy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    /** 跳转至首页 */
    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
    
    /** 跳转至用户页面 */
    @RequestMapping("/user")
    public String toUser() {
        return "user";
    }
}
