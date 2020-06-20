package main;
/**
* Copyright 2013-2020 Smartdot Technologies Co., Ltd. All rights reserved.
* SMARTDOT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* @author fengnc
* @created 2020年6月6日 下午2:37:11
* @ClassName 类名称
* @Description 类描述
*/
import main.Employee;
public class Manager extends Employee {
    
    String level;
    
    public Manager (String name) {
        super(name);
        
    }
    
    public void empLevel (String empLevel) {
        level = empLevel;
    }

    public void printEmployee() {
        //调用父类的方法
        super.printEmployee();
        
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("等级:" + level);
        System.out.println("薪水:" + salary);        
    }

    @Override
    public void custom() {
        System.out.println("lalala");
        
    }
    
}

