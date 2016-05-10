package com.Ecar.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaohei on 16/5/10.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){

        return "index";
    }
}
