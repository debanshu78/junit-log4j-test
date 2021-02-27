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
public class DivisionTest {
    private final int a;
    private final int b;
    private final int expected;
    private Calculator calculator;

    public DivisionTest(int a, int b, int expected){
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
                {20,10,2},
                {2,0,1},
                {1,1,1}
        });
    }

//    @Test(expected = java.lang.ArithmeticException.class)
    @Test
    public void divisionTest(){
        Assert.assertEquals(expected,calculator.division(a,b));
        calculator.display(calculator.division(a,b),a,b,"/");
    }
}
