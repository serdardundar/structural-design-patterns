package com.gh.sd.structuralpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        Message m = new TextMessage("The <FORCE> is string with this one!!");
        System.out.println(m.getContent());

        Message decorator1 = new HtmlEncodedMessage(m);
        System.out.println(decorator1.getContent());

        Base64EncodedMessage decorator2 = new Base64EncodedMessage(m);
        System.out.println("Encoded -> " + decorator2.getContent());
        System.out.println("Decoded -> " + decorator2.decode());
    }
}
