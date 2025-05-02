//package org.testing.notes;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//public class CalcServiceTest {
//
//    static CalcService calcService;
//
//    @BeforeAll
//    public static void init(){
//        calcService = new CalcService();
//    }
//
//    @Test
//    public void addTest(){
//        int actual = calcService.sum(10,20);
//        int excepted = 30;
//        Assertions.assertEquals(excepted, actual);
//    }
//
//    @Test
//    public void divideTest(){
//        Assertions.assertEquals(2, calcService.divide(10,5));
//    }
//
//    @Test
//    public void divideTestByZero(){
//        Assertions.assertThrows(IllegalArgumentException.class, ()-> calcService.divide(10,0));
//    }
//}
//
//// jab hum directly function ka name dete hai, function me to directly call ho jata ha bo
//// par jab hum lamda se dete hai, to junit ke marji se call hota ha bo and check karleta ha
//// ki bo funciton kya kr rha
