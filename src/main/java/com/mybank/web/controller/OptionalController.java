package com.mybank.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Yugov Alexandr.
 */
@Controller
@RequestMapping("optional")
public class OptionalController {

    @RequestMapping(value = "/layout" , method = RequestMethod.GET)
    public String indexLayout() {
        return "index";
    }
}
