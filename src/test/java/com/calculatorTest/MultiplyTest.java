package com.calculatorTest;

import com.calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultiplyTest {
    private final int a;
    private final int b;
    private final int expected;
    private Calculator calculator;

    public MultiplyTest(int a, int b, int expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }

    @Before
    public void setUp(){
       calculator=new Calculator();
    }
    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {10,20,200},
                {2,2,4},
                {1,1,1}
        });
    }

    @Test
    public void multiplyTest(){
        Assert.assertEquals(expected,calculator.multiply(a,b));
        calculator.display(calculator.multiply(a,b),a,b,"*");
    }
}
