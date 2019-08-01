package com.sitech.myshop.dubbo.common.servlet;

import javax.servlet.Servlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@Configuration
public class Config {

	
	@Bean
	public ServletRegistrationBean<Servlet> servlet() {
		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean<Servlet> servlet= new ServletRegistrationBean<>(streamServlet);
		servlet.setLoadOnStartup(1);
		servlet.addUrlMappings("/hystrix.stream");
		servlet.setName("hystrix");
		return servlet;
		
	}
}
