package com.mybank.data.repository;

import com.mybank.data.config.repository.EntityRepository;
import com.mybank.data.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Yugov Alexandr.
 */
@Repository
public interface UserRepository extends EntityRepository<User> {

    User getByEmail(@Param("email") String email);
}
