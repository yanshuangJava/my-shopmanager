package com.sitech.myshop.user.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.container.Main;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.sitech.myshop")
@EnableHystrixDashboard
@EnableHystrix
@EnableTransactionManagement
@MapperScan(basePackages = "com.sitech.myshop.mapper")
public class MyshopUserServiceProviderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyshopUserServiceProviderApplication.class, args);
		Main.main(args);
	}
}
