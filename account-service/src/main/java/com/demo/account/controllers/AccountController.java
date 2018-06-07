package com.demo.account.controllers;

import com.demo.account.domains.Account;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    private RestTemplate restTemplate = new RestTemplate();

    protected static final String FIELDS = "?fields=";

    protected static final String AD_ACCOUNT_FIELDS = "account_id,id,name,account_status,currency,timezone_id,"
            + "timezone_name,age,business_country_code";

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Account getAccount(@PathVariable String id) {
       // restTemplate.getForObject(uri, type);

        return new Account("act_359773042", "359773042", "aaa@com");
    }


    private String getAccountFields() {
        return FIELDS + AD_ACCOUNT_FIELDS;
    }
}
