package com.mybank.web.controller;

import com.google.common.base.Joiner;
import com.mybank.data.model.user.UserProfile;
import com.mybank.data.repository.UserProfileRepository;
import com.mybank.service.user.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Secured("ROLE_ADMIN")
@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserProfileService userProfileService;

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

    @ResponseBody
    @RequestMapping(value = "/users/all", method = RequestMethod.GET)
    public List<UserProfile> viewAllUsers() {
        return userProfileService.getAllUserProfiles();
    }
}
