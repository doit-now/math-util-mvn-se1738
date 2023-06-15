/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.giaolang.mathutil.core.test;

import static org.giaolang.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author giao.lang
 */
public class MathUtilityTest {

    //test ngoại lệ thì sao?
    @Test   //(expected=tên-ngoại-lệ.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //assertThrows(expectedType,          executable);
        //           ngoại lệ cần bắt   đưa đoạn code gây ra ngoại lệ  
        //                              đưa 1 object chứa đoạn code gây E
        //                              lambda expression đưa vào
        
//        Executable ex = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
//        
//        Executable exLamda = () -> getFactorial(-5);
                
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
    
    
    @Test
    public void testFactorialGivenRightArguementReturnsWell() {
        //assertEquals(69, 70);

        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
    }

}
