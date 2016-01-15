package com.mybank.data.repository;

import com.mybank.data.model.user.UserCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 09.01.2016.
 */
@Repository
public interface UserCreditRepository extends JpaRepository<UserCredit, Long> {
}
