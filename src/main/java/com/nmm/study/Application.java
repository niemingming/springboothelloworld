package com.nmm.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description Springboot的启动类
 * @date 2017/11/22
 * @author Niemingming
 */
@SpringBootApplication
@ComponentScan("com.nmm.study")
public class Application {

    public static void main(String[]args){
        //一行代码即可启动服务。
        SpringApplication.run(Application.class,args);
    }
}
