package com.gh.sd.structuralpatterns.facade.email;

public abstract class Template {

    public enum TemplateType {EMAIL, NEWSLETTER}

    public abstract String format(Object obj);

}
