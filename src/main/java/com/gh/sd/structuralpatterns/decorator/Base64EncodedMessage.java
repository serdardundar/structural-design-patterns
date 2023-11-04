package com.gh.sd.structuralpatterns.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {

    private Message msg;

    public Base64EncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return new String(Base64.getEncoder().encode(msg.getContent().getBytes()));
    }

    public String decode(){
        return new String(Base64.getDecoder().decode(this.getContent()));
    }
}
