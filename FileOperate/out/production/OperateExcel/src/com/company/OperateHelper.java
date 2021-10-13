package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class OperateHelper {
    void helper() throws FileNotFoundException {
        //[1] 创建读写流
        InputStream inputStream=new FileInputStream("student.xls");
        //【2】根据指定文件创建工作簿
        HSSFWorkBook
    }
}
