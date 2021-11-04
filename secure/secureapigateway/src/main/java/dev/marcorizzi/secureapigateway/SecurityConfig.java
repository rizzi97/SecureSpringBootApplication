package dev.marcorizzi.secureapigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {

		http.authorizeExchange().
		pathMatchers("/","/product/*","/productlist").permitAll()
		.anyExchange().authenticated().and()
		.oauth2Login().and().logout();
		return http.build();
	}

}


