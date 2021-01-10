package com.api.openBank.home.transactions;

/**
 * Open bank transaction object.
 * This is the object provided in the mapping
 **/
public class Transaction {
    private String id;
    private Details details;
    private ThisAccount this_account;
    private OtherAccount other_account;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }


    public ThisAccount getThis_account() {
        return this_account;
    }

    public void setThis_account(ThisAccount this_account) {
        this.this_account = this_account;
    }

    public OtherAccount getOther_account() {
        return other_account;
    }

    public void setOther_account(OtherAccount other_account) {
        this.other_account = other_account;
    }
}
