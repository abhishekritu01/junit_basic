package com.junitTesting.services;



import org.junit.jupiter.api.*;

public class CalculatorServiceJunit5 {


    // execute this method before any test
    @BeforeAll
    public static void init() {
        System.out.println("this method will be executed before any test");
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("this method will be executed after all test");
    }

    @BeforeEach
    public  void eachTestCase() {
        System.out.println("this method will be executed before each test");
    }

    @AfterEach
    public  void eachTestCaseCleanUp() {
        System.out.println("this method will be executed after each test");
    }

    @Test
    @DisplayName("Test addTwoNumber")      // this will be displayed in the console instead of the method name addTwoNumber
    public  void addTwoNumber(){
        int actual = CalculatorServices.addTwoNumber(10, 20);
        int expectedResult = 30;
        Assertions.assertEquals(expectedResult, actual, "Test addTwoNumber");

    }

    @Test
    @Disabled            // this test will be ignored
    public void sumAnyNumber(){
            int actual = CalculatorServices.sumAnyNumber(10, 20, 30, 40);
            int expectedResult = 100;
            Assertions.assertEquals(expectedResult, actual, "Test sumAnyNumber");

    }

    /**
     * @Tag
     * @Nested
     * TestFactory
     */
}
