//package com.junitTesting.services;
//
//import org.junit.*;
//
//import javax.xml.crypto.Data;
//import java.util.Date;
//
//public class CalculatorServicesTest {
//
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test  class");
//        System.out.println("started testing" + new Date());
//    }
//
//    @Before
//    public void setUp(){
//        System.out.println("Before each test method............");
//    }
//
//
//
//    //test method of addTwoNumber
//    @Test
//    public void testAddTwoNumber() {
//        System.out.println("Test addTwoNumber");
//        int result = CalculatorServices.addTwoNumber(10, 20);
//        int expected = 30;
//        // 1. actual value, 2. expected value
//        Assert.assertEquals(expected, result);
//
//    }
//
//    @Test(timeout = 2000)
//    public void sumAnyNumber() {
//        int count = 0;
//        for(int i = 0; i < 100000; i++){
//            count++;
//
//        }
//
////        Thread thread = new Thread();
////        try {
////            thread.sleep(3000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        System.out.println("Test sumAnyNumber");
//        int result = CalculatorServices.sumAnyNumber(10, 20, 30, 40);
//        int expected = 100;
//        // 1. actual value, 2. expected value
//        Assert.assertEquals(expected, result);
//    }
//
//    @Test
//    public void testSubtractTwoNumber() {
//        System.out.println("Test subtractTwoNumber");
//        int result = CalculatorServices.subtractTwoNumber(20, 10);
//        int expected = 10;
//        // 1. actual value, 2. expected value
//        Assert.assertEquals(expected, result);
//    }
//
//    // junit 5 important annotation
//    // 1. @beforeClass
//
//
//    @AfterClass
//    public static void destroy(){
//        System.out.println("After all test class");
//        System.out.println("ended testing" + new Date());
//    }
//
//}
