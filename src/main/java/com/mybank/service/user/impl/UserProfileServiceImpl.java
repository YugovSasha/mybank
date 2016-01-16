package com.mybank.service.user.impl;

import com.mybank.data.model.user.UserProfile;
import com.mybank.data.repository.UserProfileRepository;
import com.mybank.service.user.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public List<UserProfile> getAllUserProfiles() {
        return userProfileRepository.findAll();
    }
}
