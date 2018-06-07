package com.demo.account.controllers;

import com.demo.account.domains.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {



    @RequestMapping(method = RequestMethod.GET)
    public Account getAccount() {
        return new Account("act_359773042", "359773042", "aaa@com");
    }
}
