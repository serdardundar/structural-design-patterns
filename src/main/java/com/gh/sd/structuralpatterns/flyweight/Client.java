package com.gh.sd.structuralpatterns.flyweight;

import com.gh.sd.structuralpatterns.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GENERIC_SYSTEM_ERROR);
		System.out.println(msg1.getText("4056"));
		
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(msg2.getText(null));
	}

}
