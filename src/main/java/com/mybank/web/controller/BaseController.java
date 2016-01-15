package com.mybank.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Yugov Alexandr.
 */
@Controller
public class BaseController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    private String homeLayout() {
        return "index";
    }
}
