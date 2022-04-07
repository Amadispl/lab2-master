package com.example.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String index()
    {
        return "Hello World";
    }
    @RequestMapping("/hello/{name}/{age}")
    @ResponseBody
    public String menu(@PathVariable String name, @PathVariable int age, @RequestParam(required = false) String param,@RequestParam(required = false) Boolean param2
                       )
    {
        return "Hello"+name+" "+age+"\n"+param+" "+param2;
    }
}
