package com.example.password_validator;

import java.util.regex.Pattern;

public class Validator2 {
    public Validator2() { }

    public int ValidationStage2(String password) {
        int i = 0;
        //define and implement at least 3 more rules.
        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern lowerCase = Pattern.compile("[a-z]");
        Pattern digits = Pattern.compile("[0-9]");

        //make sure the password length is greater than 8 and the character is not "password".
        if ((password.length() > 7) && !password.equalsIgnoreCase("password")) {
            i++;
            }

        //the password must include at least one Upper, LowerCase and digit character.
        if (upperCase.matcher(password).find() && lowerCase.matcher(password).find() && digits.matcher(password).find()) {
            i++;
        }
        return i;
    }
}
