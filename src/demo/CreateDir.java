package demo;

import java.io.File;

/**
* Copyright 2013-2020 Smartdot Technologies Co., Ltd. All rights reserved.
* SMARTDOT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* @author fengnc
* @created 2020年6月20日 下午4:52:47
* @ClassName 类名称
* @Description 类描述
*/

public class CreateDir {
    public static void main(String args[]) {
        String dirname = "tmp/user/java/bin";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }
}

