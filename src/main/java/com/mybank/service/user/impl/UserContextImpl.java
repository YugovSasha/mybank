package com.mybank.service.user.impl;

import com.mybank.data.model.user.User;
import com.mybank.data.repository.UserRepository;
import com.mybank.service.user.UserAuthenticationPrincipleContext;
import com.mybank.service.user.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserContextImpl implements UserContext {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAuthenticationPrincipleContext userAuthenticationPrincipleContext;

    @Override
    public User current() throws RuntimeException {
        return optional().orElseThrow(RuntimeException::new);
    }

    @Override
    public Optional<User> optional() {
        return Optional.ofNullable(persistedUser());
    }

    private User persistedUser() {
        User user = userAuthenticationPrincipleContext.currentAuthenticationPrinciple();
        return user != null ? userRepository.findOne(user.getId()) : null;
    }
}
