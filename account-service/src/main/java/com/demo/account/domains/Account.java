package com.demo.account.domains;

public class Account {

    private final String id;
    private final String account_id;
    private final String email;

    public Account(String id, String type, String email) {
        this.id = id;
        this.account_id = type;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public String getEmail() {
        return email;
    }
}
