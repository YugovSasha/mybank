package com.mybank.service.user.impl;

import com.mybank.data.model.user.User;
import com.mybank.service.user.UserAuthenticationPrincipleContext;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class UserAuthenticationPrincipleContextImpl implements UserAuthenticationPrincipleContext {

    @Override
    public User currentAuthenticationPrinciple() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated() || authentication instanceof AnonymousAuthenticationToken) {
            return null;
        }

        Object principal = authentication.getPrincipal();
        Assert.isTrue(principal instanceof User, "Authentication principal is expected to be User");

        return (User) principal;
    }
}
