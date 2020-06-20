package demo;
/**
* Copyright 2013-2020 Smartdot Technologies Co., Ltd. All rights reserved.
* SMARTDOT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* @author fengnc
* @created 2020年6月6日 下午3:44:04
* @ClassName static 修饰符的使用样例
* @Description 类描述
*/

public class Static {
    private static byte num = 0;
    protected static byte getNum () {
        return num;
    }
    
    private static void addNum () {
        num++;
    }
    
    public Static () {
        Static.addNum();
    }
    
    
    public static void main (String[] args) {
        byte n = Static.getNum();
        System.out.println(n);
        
        for (int i = 0; i < 100; i++) {
            new Static();
        }
        
        n = Static.getNum();
        System.out.println(n);
    }
}

