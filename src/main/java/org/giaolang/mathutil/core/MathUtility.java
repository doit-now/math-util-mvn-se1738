/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
//clone cái class huyền thoại java.util.Math của JDK
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    
    //hàm tính n! = 1.2.3...n
    //0! = 1! = 1
    //ko có giai thừa cho số âm
    //21! là kiểu long ko chứa nổi
    //gài ràng buộc đầu vào cho hàm/method
//    public static long getFactorial(int n) {
//                      
//        long product = 1; //tích ban đầu = 1
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz.");
//        
//        if (n == 0 || n == 1)
//            return 1; 
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
    //return sớm để hàm ko báo lỗi
    
    public static long getFactorial(int n) {                    
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz.");
        
        if (n == 0 || n == 1)
            return 1; 
        
        return n * getFactorial(n - 1);        
    }
    
}
