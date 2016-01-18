package com.mybank.service.user.impl;

import com.google.common.collect.Sets;
import com.mybank.data.model.credit.Request;
import com.mybank.data.model.user.User;
import com.mybank.data.model.user.UserProfile;
import com.mybank.data.repository.GroupAuthorityRepository;
import com.mybank.data.repository.UserProfileRepository;
import com.mybank.service.user.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private GroupAuthorityRepository groupAuthorityRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserProfile save(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    @Override
    public UserProfile createFromRequest(Request request) {
        UserProfile persistUserProfile = userProfileRepository.findByUserEmail(request.getEmail());
        if (persistUserProfile == null) {
            User user = new User();
            user.setEmail(request.getEmail());
            user.setPhone(request.getPhone());
            user.setPassword(passwordEncoder.encode(new BigInteger(130, new SecureRandom()).toString(32)));
            user.setGroupAuthorities(Sets.newHashSet(groupAuthorityRepository.findByName("ROLE_USER")));
            UserProfile userProfile = new UserProfile();
            userProfile.setFirstName(request.getFirstName());
            userProfile.setLastName(request.getLastName());
            userProfile.setPatronymic(request.getPatronymic());
            userProfile.setUser(user);
            return userProfileRepository.save(userProfile);
        }
        return persistUserProfile;
    }

    @Override
    public List<UserProfile> getAll() {
        return userProfileRepository.findAll();
    }
}
