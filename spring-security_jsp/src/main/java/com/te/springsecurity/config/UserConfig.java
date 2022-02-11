package com.te.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.te.springsecurity.service.UserService;
@EnableWebSecurity
public class UserConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService service;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
 
       auth.userDetailsService(service);		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		  .cors().disable()
		  .authorizeRequests()
		  .antMatchers("/admin")
		  .hasRole("ADMIN")
		  .antMatchers("/user")
		  .hasAnyRole("ADMIN","USER")
		  .antMatchers("/reg")
		  .permitAll()
		  .antMatchers("/")
		  .permitAll()
		  .antMatchers("/details")
		  .hasRole("ADMIN")
		  .antMatchers("/delete")
		  .hasRole("ADMIN")
		  .antMatchers("/showall")
		  .hasRole("ADMIN")
		  .antMatchers("/update")
		  .hasAnyRole("ADMIN","USER")
		  .and()
		  .formLogin();
		  
	}
	
	
@Bean
public	PasswordEncoder encoder() {
	return NoOpPasswordEncoder.getInstance();
		
	}

	
	
	
	
}
