package com.mybank.service.credit;

import com.mybank.data.model.credit.CreditType;

import java.util.List;

/**
 * @author Yugov Alexandr.
 */
public interface CreditTypeService {

    List<CreditType> getAll();

    CreditType save(CreditType creditType);
}
