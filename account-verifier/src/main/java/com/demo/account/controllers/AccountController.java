package com.demo.account.controllers;

import com.demo.account.domains.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    private RestTemplate restTemplate = new RestTemplate();

    protected static final String GRAPH_API_URL = "https://graph.facebook.com/v2.12/act_";
    String token = "?access_token=EAAAAIm3moD0BACYVhLV5F8nUEWJYJLnu5UGAZBehHmUROFHGpWJ89qFrCbwChT59OVt4HBoJZAZCH6ztZBHarkOVmpY2nAzRJGhIvcFZAMWPnfoNZB3r4oB8DnCRjOI0KfMnyuIjgN5uccpENo7U4KsHtuwQQ9ZCIvcI5qsgnhT8LjiJDi5zvxIjeOZC9MZA4wpazBpNVv0XSuwZDZD";

    protected static final String FIELDS = "&fields=account_id,id,name";

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable String id) {
        return restTemplate.getForObject(GRAPH_API_URL+id + token+FIELDS, Account.class);
    }

}
