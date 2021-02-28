package com.calculator;


import org.apache.log4j.Logger;

public class Calculator {
    private final Logger logger = Logger.getLogger("code");
    public int add(int a,int b){
        logger.info("Number for addition received "+a+" & "+b);
        return a+b;
    }
    public int subtract(int a, int b){
        logger.info("Number for subtraction received "+a+" & "+b);
        return a-b;
    }
    public int multiply(int a,int b){
        logger.info("Number for multiplication received "+a+" & "+b);
        return a*b;
    }
    public int division(int a, int b){
        logger.info("Number for division received "+a+" & "+b);
        return a/b;
    }

    public void primeCheck(int n){
        logger.info("Number for prime check received "+n);
        if(n==2){
            System.out.println("Prime");
            return;
        }
        else if(n%2==0){
            System.out.println("Not prime");
            return;
        }
        for(int i=3;i<(int)Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        while(true);
    }
    public void display(int n,int a,int b,String op){
        System.out.println(a+op+b+"="+n);
    }
}
