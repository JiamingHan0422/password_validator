package com.example.password_validator;

import java.util.regex.Pattern;
public class Validator {
    private int i;
    public Validator() {
    }

    public int ValidationStage1(String password) {
        i = 0;
        // make sure the password length is greater than 8 and the character is not "password".
        if((password.length()>8)|| !password.equalsIgnoreCase("password"))  {
            i ++;
        }
        return i;
    }

}