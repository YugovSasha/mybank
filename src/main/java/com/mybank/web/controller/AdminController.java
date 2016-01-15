package com.mybank.web.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by a2.yugov on 15.01.2016.
 */
@Secured("RULE_ADMIN")
@Controller
@RequestMapping("admin")
public class AdminController {

    @RequestMapping(value = "/layout", method = RequestMethod.GET)
    private String layout() {
        return "admin/layout";
    }
}