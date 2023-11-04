package com.gh.sd.structuralpatterns.decorator;

import org.apache.commons.text.StringEscapeUtils;

/**
 * Decorator which implements component interface
 */
public class HtmlEncodedMessage implements Message {

    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
}
