package com.example.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FPUUnitTest {

    static float r1 = 10.5f;
    static float r2 = 14.7f;

    static FPU fpu;

    @BeforeClass
    public static void init()
    {
        fpu = new FPU();
        fpu.setRegisters(r1,r2);
    }

    @Test
    public void r1IsCorrect()
    {
        //Note the delta threshold.
        // float == float is generally a bad idea due to floating point errors
        assertEquals(r1,fpu.getR1(),0.02f);
    }

    @Test
    public void r2IsCorrect()
    {
        //Note the delta threshold.
        // float == float is generally a bad idea due to floating point errors
        assertEquals(r2,fpu.getR2(),0.02f);
    }

    @Test
    public void FPUKnowsHowToSum()
    {
        assertEquals(r1+r2, fpu.sum(), 0.02f);
    }

}
