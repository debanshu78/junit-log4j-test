package com.calculatorTest;

import com.calculator.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AddTest {
    private final int a;
    private final int b;
    private final int expected;
    private Calculator calculator;

    public AddTest(int a,int b,int expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        System.out.println("Addition result:");
        return Arrays.asList(new Object[][]{
                {10,20,30},
                {2,2,4},
                {1,1,2}
        });

    }

    @Before
    public void setUp(){
        calculator=new Calculator();
    }
    @Test
    public void addTest(){
        Assert.assertEquals(expected,calculator.add(a,b));
        calculator.display(calculator.add(a,b),a,b,"+");
    }

}
