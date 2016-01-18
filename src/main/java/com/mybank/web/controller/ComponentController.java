package com.mybank.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Yugov Alexandr.
 */
@Controller
@RequestMapping("component")
public class ComponentController {

    @RequestMapping(value = "/optional/layout" , method = RequestMethod.GET)
    public String optionalLayout() {
        return "component/optional";
    }
}
