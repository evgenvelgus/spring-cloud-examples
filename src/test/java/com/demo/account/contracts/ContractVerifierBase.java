package com.demo.account.contracts;

import com.demo.account.ContractRestServiceApplication;
import io.restassured.RestAssured;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContractRestServiceApplication.class)
public class ContractVerifierBase {

    @Autowired
    private WebApplicationContext context;


    @Before
    public void setUp() throws Exception {
        RestAssured.baseURI = "https://graph.facebook.com/v3.0";
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}
