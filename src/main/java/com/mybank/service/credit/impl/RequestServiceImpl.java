package com.mybank.service.credit.impl;

import com.mybank.data.model.credit.Request;
import com.mybank.data.model.user.UserProfile;
import com.mybank.data.repository.RequestRepository;
import com.mybank.service.credit.RequestService;
import com.mybank.service.user.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yugov Alexandr.
 */
@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public List<Request> getAll() {
        return requestRepository.findAll();
    }

    @Override
    public void approve(Request request) {
        UserProfile userProfile = userProfileService.createFromRequest(request);
        userProfile.getRequests().add(request);
        userProfileService.save(userProfile);
    }

    @Override
    public void reject(Request request) {

    }
}
