package com.kata.configuration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTimeValidator {

    public static boolean validate(String time) {
        Pattern pattern = Pattern.compile(Constants.TIME_REGEX);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }
}
