package com.mybank.service.credit;

import com.mybank.data.model.credit.Credit;

import java.util.List;

/**
 * @author Yugov Alexandr.
 */
public interface CreditService {

    Credit save(Credit userProfile);

    List<Credit> getAll();
}
