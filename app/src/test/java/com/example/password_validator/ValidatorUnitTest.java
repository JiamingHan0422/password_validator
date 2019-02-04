package com.example.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.validation.Validator;

public class ValidatorUnitTest{
    private static Validator isValid;

    @BeforeClass
    public static void init(){
       isValid = new Validator();
    }

    @Test
    public void CheckValidate(){
        String password1 = "Jhan159753";
        String password2 = "password";

        int checkResult1 = isValid.ValidationStage1(password1 );
        int checkResult2 = isValid.ValidationStage1(password2 );

        assertEquals(2,checkResult1);
        assertEquals(2,checkResult2);
    }

    }
