package org.example.controller;

import org.example.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MyThymeleafController {
    @RequestMapping("/myThymeleaf")
    public String myThymeleaf(HttpServletRequest request)
    {
        request.setAttribute("Student",new Student("张三",20));
        return "myThymeleaf";
    }
}
