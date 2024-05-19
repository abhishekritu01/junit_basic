package com.junitTesting.services;

import org.junit.jupiter.api.Assertions;

public class AssertExample {

    //Assertion :validating actual and expected result

    public void test1() {
        System.out.println("Testing some assertion method");
        int actual = 10;
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
}
