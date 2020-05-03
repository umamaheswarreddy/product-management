package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulProxyServerApplication  extends LoggerImpl{

	public static void main(String[] args) {
		
		LoggerImpl obj=new LoggerImpl();
		try {
		SpringApplication.run(ZuulProxyServerApplication.class, args);
		obj.run2("zuul");
		}
		catch(Exception e)
		{
			obj.warning("Zull");
		}
		
	}

}
