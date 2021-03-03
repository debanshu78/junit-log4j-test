package com.calculatorTest;

import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    private static final Logger logger = Logger.getLogger("test");
    public static void main(String[] args) {
        Result result= JUnitCore.runClasses(CalculatorTestSuite.class);
        System.out.println("\n Fails at:");
        logger.debug("\nFails At:");
        for(Failure failure:result.getFailures()){
            logger.error(failure.toString());
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
