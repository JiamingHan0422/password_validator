package com.example.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ValidateUnitTest{
     static Validator isValid;

    @BeforeClass
    public static void init(){
        isValid = new Validator();

    }

    @Test
    public void CheckValidate(){
        String password1, password2, password3, password4;

        password1 = "PASSWORD";
        password2 = "password";
        password3 = "Pword";
        password4 = "ppaasswwoorrdd";

        int checkResult1, checkResult2, checkResult3, checkResult4;
        checkResult1 = isValid.ValidationStage1(password1 );
        checkResult2 = isValid.ValidationStage1(password2 );
        checkResult3 = isValid.ValidationStage1(password3 );
        checkResult4 = isValid.ValidationStage1(password4 );

        assertEquals(0,checkResult1);
        assertEquals(0,checkResult2);
        assertEquals(0,checkResult3);
        assertEquals(1,checkResult4);
    }

}