package com.learning.git;

public class MainApp {

    public static void main(String args[]) {
        System.out.println("This is class for git training with Intellij");

        FunctionalInterface funcIntf = (value1,value2) -> {
            return value1+value2;
        };
        System.out.println("The Sum of two number is " +funcIntf.perform(10,20));

        ChildAppOne childAppOne = new ChildAppOne();
        System.out.print(childAppOne.display());
    }


}
