package com.mybank.web.controller;

import com.mybank.data.model.user.UserProfile;
import com.mybank.service.user.UserProfileContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private UserProfileContext userProfileContext;

    @RequestMapping(value = "/current")
    @ResponseBody
    public UserProfile viewCurrentUserProfile() {
        return userProfileContext.optional().orElse(null);
    }
}
