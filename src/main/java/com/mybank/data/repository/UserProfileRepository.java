package com.mybank.data.repository;

import com.mybank.data.config.repository.EntityRepository;
import com.mybank.data.model.user.User;
import com.mybank.data.model.user.UserProfile;

/**
 * Created by a2.yugov on 15.01.2016.
 */
public interface UserProfileRepository extends EntityRepository<UserProfile> {

    UserProfile findByUser(User user);

    UserProfile findByUserEmail(String email);
}
