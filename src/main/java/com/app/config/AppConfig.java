package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.app")
@EnableWebMvc
@Import(SecurityConfig.class)
public class AppConfig {

	@Bean
	public BCryptPasswordEncoder pwdEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vw=new InternalResourceViewResolver();
		vw.setPrefix("/WEB-INF/views/");
		vw.setSuffix(".jsp");
		return vw;
	}
}
