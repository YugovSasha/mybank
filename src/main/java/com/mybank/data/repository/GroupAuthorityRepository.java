package com.mybank.data.repository;

import com.mybank.data.config.repository.EntityRepository;
import com.mybank.data.model.user.GroupAuthority;

/**
 * @author Yugov Alexandr.
 */
public interface GroupAuthorityRepository extends EntityRepository<GroupAuthority> {

    GroupAuthority findByName(String name);
}
