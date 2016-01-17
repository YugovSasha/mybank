package com.mybank.service.credit.impl;

import com.mybank.data.model.credit.Credit;
import com.mybank.data.repository.CreditRepository;
import com.mybank.service.credit.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yugov Alexandr.
 */
@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditRepository creditRepository;

    @Override
    public Credit save(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public List<Credit> getAll() {
        return creditRepository.findAll();
    }
}
