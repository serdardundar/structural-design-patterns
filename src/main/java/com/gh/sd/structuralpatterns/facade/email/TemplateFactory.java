package com.gh.sd.structuralpatterns.facade.email;

import com.gh.sd.structuralpatterns.facade.email.Template.TemplateType;

import java.util.Objects;

public class TemplateFactory {

    private TemplateFactory() {
    }

    public static Template createTemplateFor(TemplateType type) {
        if (Objects.requireNonNull(type) == TemplateType.EMAIL) {
            return new OrderEmailTemplate();
        }
        throw new IllegalArgumentException("Unknown TemplateType");

    }
}
