package com.finalproject.Fantastic.Footwear;

import com.finalproject.Fantastic.Footwear.config.jwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FantasticFootwearApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasticFootwearApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<jwtFilter> jwtFilter()
	{
		FilterRegistrationBean<jwtFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter( new jwtFilter() );
//		registrationBean.addUrlPatterns( "/api/*" );
		return registrationBean;
	}

}
