package com.example.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorUnitTest {
    private static Validator2 isValid;

    @BeforeClass
    public static void init(){
        isValid = new Validator2();
    }

    @Test
    public void passwordValidate() {

        //Check which of these Passwords are Valid.
        String passwordCheck0 = "960422";
        String passwordCheck1 = "19960422";

        String passwordCheck2 = "jm0422";
        String passwordCheck3 = "jm960422";

        String passwordCheck4 = "JM0422";
        String passwordCheck5 = "JM960422";

        String passwordCheck6 = "Password";
        String passwordCheck7 = "Password123";

        String passwordCheck8 = "Jm960422";

        int Result0, Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8;

         Result0 = isValid.ValidationStage2(passwordCheck0);
         Result1 = isValid.ValidationStage2(passwordCheck1);
         Result2 = isValid.ValidationStage2(passwordCheck2);
         Result3 = isValid.ValidationStage2(passwordCheck3);
         Result4 = isValid.ValidationStage2(passwordCheck4);
         Result5 = isValid.ValidationStage2(passwordCheck5);
         Result6 = isValid.ValidationStage2(passwordCheck6);
         Result7 = isValid.ValidationStage2(passwordCheck7);
         Result8 = isValid.ValidationStage2(passwordCheck8);

        //Chech if these passwords matched requirements
        assertEquals(0,Result0);
        assertEquals(1,Result1);
        assertEquals(0,Result2);
        assertEquals(1,Result3);
        assertEquals(0,Result4);
        assertEquals(1,Result5);
        assertEquals(0,Result6);
        assertEquals(2,Result7);
        assertEquals(2,Result8);


    }
}