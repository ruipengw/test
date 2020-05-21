package com.Service;
import com.Service.Add;
import com.controller.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;


@org.springframework.boot.autoconfigure.SpringBootApplication

@Controller
public class SpringBootApplication {
    @Autowired
    private Add add;

    //@Autowired
    //private Query query;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
        //add.addItem("hhh","666");
    }



}
