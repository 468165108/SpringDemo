package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.User;

/**
 * @author Chingyu Mo
 * @create 2016-07-23-20:20
 */

// 注解标注此类为springmvc的controller，url映射为"/home"
    @Controller
    @RequestMapping("/home")
    public class homeController {
        //添加一个日志器
        private final Logger logger = LoggerFactory.getLogger(homeController.class);

        //映射一个action
        @RequestMapping("/index")
        public  String index(){
            //输出日志文件
            logger.info("the first jsp pages");
            //返回一个index.jsp这个视图
            return "index";
        }
     
        @RequestMapping("/jsonTest")
        @ResponseBody
        public  String jsonTest(){
            //输出日志文件
            logger.info("the first jsp pages");
            //返回一个index.jsp这个视图
            return "indexJson";
        }
        	
        @RequestMapping("/jsonUser")
        @ResponseBody
        public  User jsonUser(){
        	User u=new User("123","123","123");
            return u;
        }
        
        
        
        
        @RequestMapping("/jsonList")
        @ResponseBody
        public  List<User> jsonList(){
            //输出日志文件
          
        	List<User> list=new ArrayList<User>();
        	
        	User u=new User("123","123","123");
        	
        	list.add(u);
            //返回一个index.jsp这个视图
            return list;
        }
        
        
        
    }
