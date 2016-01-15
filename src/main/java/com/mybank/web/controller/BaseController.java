package com.mybank.web.controller;

import com.mybank.data.model.bank.Credit;
import com.mybank.data.model.bank.Request;
import com.mybank.data.model.bank.Score;
import com.mybank.data.model.bank.ScoreType;
import com.mybank.data.model.user.User;
import com.mybank.data.model.user.UserProfile;
import com.mybank.data.repository.CreditTypeRepository;
import com.mybank.service.bank.CreditService;
import com.mybank.service.bank.RequestService;
import com.mybank.service.bank.ScoreService;
import com.mybank.service.status.RequestStatus;
import com.mybank.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yugov Alexandr.
 */
@Controller
public class BaseController {


}
