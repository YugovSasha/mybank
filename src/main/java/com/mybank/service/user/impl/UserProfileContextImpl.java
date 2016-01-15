package com.mybank.service.user.impl;

import com.mybank.data.model.user.UserProfile;
import com.mybank.data.repository.UserProfileRepository;
import com.mybank.service.user.UserContext;
import com.mybank.service.user.UserProfileContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * User Profile Context service implementation.
 *
 * @author Vlad Fefelov
 */
@Service
@Transactional
public class UserProfileContextImpl implements UserProfileContext {

    @Autowired
    private UserContext userContext;

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public UserProfile current() {
        return userProfileRepository.findByUser(userContext.current());
    }

    @Override
    public Optional<UserProfile> optional() {
        return userContext.optional().map(userProfileRepository::findByUser);
    }
}
