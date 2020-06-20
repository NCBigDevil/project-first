/*
* Copyright 2013-2020 Smartdot Technologies Co., Ltd. All rights reserved.
* SMARTDOT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*
*/
package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
* <p>
* @author <a href="mailto:fengnc@smartdot.com.cn">冯南昌</a>
* @version 1.0, 2020年6月6日
* </p>
*/
public class First { 
    public static void main(String[] args) {


        /** 主方法 */
       
           double i = 5;
           double j = 2;
           double k = max(i, j);
           System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);
        }
      
        /** 返回两个整数变量较大的值 */
        public static int max(int num1, int num2) {
           int result;
           if (num1 > num2)
              result = num1;
           else
              result = num2;
      
           return result; 
        }
    
    
    public static double max(double num1, double num2) {
        if (num1 > num2)
          return num1;
        else
          return num2;
      }
    

        
        
    
}



