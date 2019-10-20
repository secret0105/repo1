package com.zhoujin.controller;

import com.zhoujin.pojo.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class DemoCotroller2 {

//    @RequestMapping("demo1")
//    public String demo1(){
//        System.out.println("执行demo1");
//        return "index.jsp";
//    }
    @RequestMapping("demo1")
    public String demo1(String name, int age, People peo , HttpServletRequest req){
        System.out.println(name+"  "+age+"   "+peo);
        req.setAttribute("hello","haha");
        return "main.jsp";
    }

    @RequestMapping("demo2/{name}/{id}")
    public String demo2(@PathVariable String name, @PathVariable("id") int age){
        System.out.println(name+"---"+age);
        return "/main.jsp";
    }

    @RequestMapping("demo3")
    public String demo3(){
        return "forward:demo4";
    }

    @RequestMapping("demo4")
    public String demo4(){
        return "test.jsp";
    }

}
