package com.gh.sd.structuralpatterns.flyweight;

//Interface implemented by Flyweights
public interface ErrorMessage {
	//Get error message
	String getText(String code);
}
