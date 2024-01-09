package com.health.yatra.insurance.yatra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	public UserDetailsService userDetailsService (PasswordEncoder passwordEncoder)
	{
		UserDetails admin = User.withUsername("sathish").password( passwordEncoder.encode("krish")).roles("ADMIN").build();
		UserDetails user = User.withUsername("tamil").password(passwordEncoder.encode("selvan")).roles("USER").build();
		return new InMemoryUserDetailsManager(admin,user);
	}
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.csrf().disable().authorizeHttpRequests().requestMatchers("/health/register").permitAll()
		.and().authorizeHttpRequests().requestMatchers("/health/**").authenticated()
		.and().formLogin().and().build();
		return null;
	}

}
