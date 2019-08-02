package com.sitech.myshop.user.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.sitech.myshop" )
public class MyshopUserServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyshopUserServiceConsumerApplication.class, args);
	}
}
