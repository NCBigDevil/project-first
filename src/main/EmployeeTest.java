/*
* Copyright 2013-2020 Smartdot Technologies Co., Ltd. All rights reserved.
* SMARTDOT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*
*/
/**
* <p>
* @author <a href="mailto:fengnc@smartdot.com.cn">冯南昌</a>
* @version 1.0, 2020年6月4日
* </p>
*/
package main;

import main.Employee;
import main.Manager;

public class EmployeeTest {
    public static void main (String[] args) {
        
        //因为Employee增加了抽象方法，所以Employee变成了抽象类，不能直接实例化
        /*
        Employee empOne = new Employee("fengnc");
        
        empOne.empAge(18);
        empOne.empDesignation("工人");
        empOne.empSalary(3300);
        empOne.printEmployee();
         */

        
        System.out.println("-----------------------------");
        
        Manager empTwo = new Manager("Nick");
        
        empTwo.empAge(33);
        empTwo.empDesignation("办公室主任");
        empTwo.empSalary(5050);
        empTwo.empLevel("二级");
        empTwo.printEmployee();
        
        
    }
}
