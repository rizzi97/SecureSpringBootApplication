package dev.marcorizzi.secureapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;

@SpringBootApplication
public class SecureapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureapigatewayApplication.class, args);
	}

}
