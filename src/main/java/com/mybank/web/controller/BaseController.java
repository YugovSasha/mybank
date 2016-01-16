package com.mybank.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String indexLayout() {
        return "index";
    }

    @RequestMapping(value = "/global/layout" , method = RequestMethod.GET)
    public String globalLayout() {
        return "global/layout";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "global/login/layout";
    }
}
