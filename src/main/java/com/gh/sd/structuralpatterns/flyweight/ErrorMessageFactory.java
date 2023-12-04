package com.gh.sd.structuralpatterns.flyweight;

import java.util.EnumMap;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {

    //This serves as key for getting flyweight instance
    public enum ErrorType {GENERIC_SYSTEM_ERROR, PAGE_NOT_FOUND_ERROR, SERVER_ERROR}

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private final EnumMap<ErrorType, SystemErrorMessage> errorMessages = new EnumMap<>(ErrorType.class);

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GENERIC_SYSTEM_ERROR,
            new SystemErrorMessage("A genetic error of type $errorCode occured. Please refer to:\n",
                "http://google.com/q="));
        errorMessages.put(ErrorType.PAGE_NOT_FOUND_ERROR,
            new SystemErrorMessage("Page not foun. An error of type $errorCode occured. Please refer to:\n",
                "http://google.com/q="));
    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}
