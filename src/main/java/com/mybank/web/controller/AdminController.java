package com.mybank.web.controller;

import com.google.common.base.Joiner;
import com.mybank.data.model.credit.Credit;
import com.mybank.data.model.credit.CreditType;
import com.mybank.data.model.credit.Request;
import com.mybank.data.model.user.UserProfile;
import com.mybank.service.credit.CreditService;
import com.mybank.service.credit.CreditTypeService;
import com.mybank.service.credit.RequestService;
import com.mybank.service.user.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Secured("ROLE_ADMIN")
@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private CreditService creditService;

    @Autowired
    private CreditTypeService creditTypeService;

    @Autowired
    private RequestService requestService;

    @RequestMapping(value = "/layout", method = RequestMethod.GET)
    public String layout() {
        return "global/admin/layout";
    }

    @RequestMapping(value = "/{section}", method = RequestMethod.GET)
    public String filters(@PathVariable String section) {
        return Joiner.on('/').join("global", "admin", section);
    }

    @RequestMapping(value = "/{entity}/edit/layout", method = RequestMethod.GET)
    public String edit(@PathVariable String entity) {
        return Joiner.on('/').join("global", "admin", "dialog", "edit-" + entity);
    }

    @ResponseBody
    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public List<UserProfile> viewAllUsers() {
        return userProfileService.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/user/edit", method = RequestMethod.POST)
    public void editUser(@RequestBody UserProfile userProfile) {
        userProfileService.save(userProfile);
    }

    @ResponseBody
    @RequestMapping(value = "/credit/all", method = RequestMethod.GET)
    public List<Credit> viewAllCredits() {
        return creditService.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/credit/edit", method = RequestMethod.POST)
    public void editCredit(@RequestBody Credit credit) {
        creditService.save(credit);
    }

    @ResponseBody
    @RequestMapping(value = "/credit-type/edit", method = RequestMethod.POST)
    public void editCredit(@RequestBody CreditType creditType) {
        creditTypeService.save(creditType);
    }

    @ResponseBody
    @RequestMapping(value = "/requests/all", method = RequestMethod.GET)
    public List<Request> viewAllRequests() {
        return requestService.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/request/approve", method = RequestMethod.POST)
    public void approveRequest(@RequestBody Request request) {
        requestService.approve(request);
    }
}
