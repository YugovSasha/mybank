package com.mybank.service.credit;

import com.mybank.data.model.credit.Request;

import java.util.List;

/**
 * @author Yugov Alexandr.
 */
public interface RequestService {

    List<Request> getAll();

    void approve(Request request);

    void reject(Request request);
}
