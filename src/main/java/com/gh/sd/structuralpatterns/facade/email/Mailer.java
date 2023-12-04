package com.gh.sd.structuralpatterns.facade.email;

public class Mailer {

    private Mailer() {}

    private static final class InstanceHolder {
        private static final Mailer INSTANCE = new Mailer();
    }

    public static synchronized Mailer getInstance() {

        return InstanceHolder.INSTANCE;
    }
    public boolean send(Email email) {
        return true;
    }
}
