package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Add {
    @Autowired
    private StringRedisTemplate redis;

    @RequestMapping("/add")
    @ResponseBody
    public String add (){
        redis.opsForValue().set("wang", "18");
        System.out.println("success");
        return "add" ;

    }
    @RequestMapping("/hello")
    public String hello (){

        return "hello" ;

    }

    public void addItem(String key, String value){
       redis.opsForValue().set(key, value);

    }
}
