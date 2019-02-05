package com.example.password_validator;

/**
 * Created by Franz on 2018-02-03.
 */

public class FPU {
    private float register1, register2;

    public void setRegisters(float r1, float r2)
    {
        register1 = r1;
        register2 = r2;
    }

    public  float getR1()
    {
        return register1;
    }

    public float getR2()
    {
        return  register2;
    }

    public float sum()
    {
        return (register1 + register2);
    }

    public float multiply()
    {
        return  register1 * register2;
    }
}
