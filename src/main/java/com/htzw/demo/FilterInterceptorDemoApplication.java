package com.htzw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Administrator
 */
@SpringBootApplication
@ServletComponentScan
public class FilterInterceptorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterInterceptorDemoApplication.class, args);
	}

}
