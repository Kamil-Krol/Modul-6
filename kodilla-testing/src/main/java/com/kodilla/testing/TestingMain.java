package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if(result.equals("theForumUser"))
        {
            System.out.println("test ok");
        }
        else
        {
            System.out.println("Error");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(6,4);

        int sum = calculator.add();
        int sub = calculator.subtract();

        if(sum == 6+4)
        {
            System.out.println("test add ok");
        }
        else
        {
            System.out.println("test add error");
        }

        if(sub == 6-4)
        {
            System.out.println("test subtract ok");
        }
        else
        {
            System.out.println("test subtract error");
        }


    }
}
