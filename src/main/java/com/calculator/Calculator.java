package com.calculator;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int division(int a, int b){
        return a/b;
    }

    public int timingCalculation(int n){
        for(int i=n;i>0;i--){
            n=n-1;
        }
        return n;
    }
    public void display(int n,int a,int b,String op){
        System.out.println(a+op+b+"="+n);
    }
}
