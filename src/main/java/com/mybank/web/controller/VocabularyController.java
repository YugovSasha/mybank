package com.mybank.web.controller;

import com.mybank.data.model.credit.CreditType;
import com.mybank.service.credit.CreditTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Yugov Alexandr.
 */
@Controller
@RequestMapping("vocabulary")
public class VocabularyController {

    @Autowired
    private CreditTypeService creditTypeService;

    @ResponseBody
    @RequestMapping(value = "/credit-types/all", method = RequestMethod.GET)
    public List<CreditType> viewAllCreditTypes() {
        return creditTypeService.getAll();
    }
}
