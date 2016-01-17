package com.mybank.service.credit.impl;

import com.mybank.data.model.credit.CreditType;
import com.mybank.data.repository.CreditTypeRepository;
import com.mybank.service.credit.CreditTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yugov Alexandr.
 */
@Service
public class CreditTypeServiceImpl implements CreditTypeService {

    @Autowired
    private CreditTypeRepository creditTypeRepository;

    @Override
    public List<CreditType> getAll() {
        return creditTypeRepository.findAll();
    }

    @Override
    public CreditType save(CreditType creditType) {
        return creditTypeRepository.save(creditType);
    }
}
