package com.mybank.web.controller;

import com.google.common.base.Joiner;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Secured("ROLE_ADMIN")
@Controller
@RequestMapping("admin")
public class AdminController {

    @RequestMapping(value = "/layout", method = RequestMethod.GET)
    public String layout() {
        return "global/admin/layout";
    }

    @RequestMapping(value = "/{section}/filter", method = RequestMethod.GET)
    public String filters(@PathVariable String section) {
        return Joiner.on('/').join("global", "admin", section, "filter");
    }

    @RequestMapping(value = "/{section}/table", method = RequestMethod.GET)
    public String tables(@PathVariable String section) {
        return Joiner.on('/').join("global", "admin", section, "table");
    }
}
