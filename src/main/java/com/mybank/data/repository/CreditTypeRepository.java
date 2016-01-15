package com.mybank.data.repository;

import com.mybank.data.model.bank.CreditType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 13.01.2016.
 */
@Repository
public interface CreditTypeRepository extends JpaRepository<CreditType, Long> {
}
