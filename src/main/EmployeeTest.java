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

public class EmployeeTest {
    public static void main (String[] args) {
        Employee empOne = new Employee("fengnc");
        
        empOne.empAge(18);
        empOne.empDesignation("工人");
        empOne.empSalary(3300);
        empOne.printEmployee();
        
        
    }
}
