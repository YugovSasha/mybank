package com.mybank.service.user;

import com.mybank.data.model.user.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile save(UserProfile userProfile);

    List<UserProfile> getAll();
}
