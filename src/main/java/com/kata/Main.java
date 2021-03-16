package com.kata;

import com.kata.configuration.Principal;
import com.kata.configuration.StringTimeValidator;
import com.kata.configuration.exception.BerlinUhrException;
import com.kata.configuration.exception.ExceptionConstants;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            throw new BerlinUhrException(ExceptionConstants.MISSING_ARGUMENT);
        }
        if (!StringTimeValidator.validate(args[0])) {
            throw new BerlinUhrException(ExceptionConstants.INVALID_STRING_TIME);
        } else {
            Principal principal = new Principal();
            System.out.println(principal.run(args[0]));
        }
    }
}
