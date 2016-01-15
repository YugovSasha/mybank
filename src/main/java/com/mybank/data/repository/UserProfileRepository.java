package com.mybank.data.repository;

import com.mybank.data.model.user.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 11/6/2015.
 */
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findByPersonalNumber(String personalNumber);
}
