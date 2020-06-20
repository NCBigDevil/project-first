package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Copyright 2013-2020 Smartdot Technologies Co., Ltd. All rights reserved.
* SMARTDOT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* @author fengnc
* @created 2020年6月20日 下午3:39:13
* @ClassName 类名称
* @Description 从控制台读取字符串
*/

public class BRReadLines {
    public static void main(String args[]) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}

