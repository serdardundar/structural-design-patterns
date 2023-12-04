package com.gh.sd.structuralpatterns.facade.email;

public class Email {

    private Email() {
    }

    public static EmailBuilder getBuilder() {
        return new EmailBuilder();
    }
}
