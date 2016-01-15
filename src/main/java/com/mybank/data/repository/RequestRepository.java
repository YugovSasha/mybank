package com.mybank.data.repository;

import com.mybank.data.model.bank.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 11/6/2015.
 */
@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
}
