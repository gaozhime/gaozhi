package org.example.Serverse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date now();
 */
@RestController
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.sex}")
    private  String sex;
    @Value("${student.age}")
    private  int age;


    @RequestMapping("/getstudent")
    public String getstudent()
    {
        return "张三,22,1999-02-18,sex";
    }


    @RequestMapping("/getproperties")
    public String getProperties()
    {
        return name+"--"+sex+"--"+age;
    }


}
