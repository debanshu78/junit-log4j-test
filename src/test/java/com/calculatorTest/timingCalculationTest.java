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
public class timingCalculationTest {
    private final int n;
    private final int expected;
    private Calculator calculator;

    private final Logger logger = Logger.getLogger("test");

    public timingCalculationTest(int n, int expected){
        this.n=n;
        this.expected=expected;
    }

    @Before
    public void setUp(){
        calculator=new Calculator();
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {5,0},
                {2,0},
                {10,0}
        });
    }

    @Test(timeout = 5)
    public void primeCheckTest(){
        logger.debug("Test for prime check started");
        calculator.primeCheck(n);
    }
}
