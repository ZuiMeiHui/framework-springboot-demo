package com.zuimeihui.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 * 
 * @ClassName: SpringBootWebApplication
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@SpringBootApplication(scanBasePackages = { "com.zuimeihui.demo" })
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}
