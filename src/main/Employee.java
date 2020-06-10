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

public abstract class Employee {
    String name;
    int age;
    String designation;
    double salary;
    
    //构造函数
    public Employee (String name) {
        this.name = name;
    }
    
    //set age value
    public void empAge(int empAge) {
        age = empAge;
    }
    
    //set designation value
    public void empDesignation (String empDesig) {
        designation = empDesig;
    }
    
    //set salary value
    protected void empSalary(double empSalary) {
        salary = empSalary;
    }
    
    
    //print message
    public void printEmployee() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }
    
    //自定义扩展方法
    public abstract void custom ();
    
}


