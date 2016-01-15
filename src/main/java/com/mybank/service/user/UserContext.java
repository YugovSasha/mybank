package com.mybank.service.user;

import com.mybank.data.model.user.User;
import com.mybank.service.user.exception.NoUserLoggedInException;

import java.util.Optional;

/**
 * Created by a2.yugov on 15.01.2016.
 */
public interface UserContext {

    User current() throws RuntimeException;

    Optional<User> optional();
}
