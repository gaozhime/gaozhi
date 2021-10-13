package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class FreemarkerController {
    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(HttpServletRequest requst, Map<String,String> result )
    {
        result.put("springname","这里是java的SpringBoot自学课堂~~~~~~~~~~~~~~~~~~~~");
        return "freemarkerIndex";
    }
}
