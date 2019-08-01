package com.sitech.myshop.user.service.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.sitech.myshop")
@EnableHystrixDashboard
@EnableHystrix
@EnableTransactionManagement
@MapperScan(basePackages = "com.sitech.myshop.mapper")
public class MyshopUserServiceProviderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyshopUserServiceProviderApplication.class, args);
	}
}
