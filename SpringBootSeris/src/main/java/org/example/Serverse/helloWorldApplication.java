package org.example.Serverse;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldApplication {
    @RequestMapping("/getuser")
    public String getUser()
    {
        return "贾文";
    }
}
