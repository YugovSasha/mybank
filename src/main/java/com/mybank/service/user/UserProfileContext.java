package com.mybank.service.user;

import com.mybank.data.model.user.UserProfile;
import com.mybank.service.user.exception.NoUserLoggedInException;

import java.util.Optional;

public interface UserProfileContext {

    UserProfile current() throws RuntimeException;

    Optional<UserProfile> optional();
}
