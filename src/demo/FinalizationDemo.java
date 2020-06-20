package demo;
/**
* Copyright 2013-2020 Smartdot Technologies Co., Ltd. All rights reserved.
* SMARTDOT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* @author fengnc
* @created 2020年6月10日 下午8:21:45
* @ClassName 类名称
* @Description 类描述
*/

public class FinalizationDemo {  
    public static void main(String[] args) {  
      System.out.println("start");
      Cake c1 = new Cake(1);  
      Cake c2 = new Cake(2);  
      Cake c3 = new Cake(3);  
        
      System.out.println("ing");
      
      c2 = c3 = null;  
      System.gc(); //调用Java垃圾收集器
      
      System.out.println("end");
    }  
  }  
   
  class Cake extends Object {  
    private int id;  
    public Cake(int id) {  
      this.id = id;  
      System.out.println("Cake Object " + id + "is created");  
    }  
      
    protected void finalize() throws java.lang.Throwable {  
      super.finalize();  
      System.out.println("Cake Object " + id + "is disposed");  
    }  
  }