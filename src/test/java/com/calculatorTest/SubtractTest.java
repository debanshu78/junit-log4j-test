package com.calculatorTest;

import com.calculator.Calculator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubtractTest {
    private final int a;
    private final int b;
    private final int expected;
    private Calculator calculator;

    private final Logger logger = Logger.getLogger("test");

    public SubtractTest(int a, int b, int expected){
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
                {10,20,-10},
                {2,2,0},
                {1,1,2}
        });
    }

    @Test
    public void subtractTest(){
        logger.debug("Test for subtraction started");
        int subRes=calculator.subtract(a,b);
        Assert.assertEquals(expected,subRes);
        calculator.display(subRes,a,b,"-");
    }
}
