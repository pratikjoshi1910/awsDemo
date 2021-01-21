package com.example.token;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RsaTokenEntity2Application {
	


	public static void main(String[] args) {
		SpringApplication.run(RsaTokenEntity2Application.class, args);
	}
	
	
	@GetMapping("/demo")
	public String getDemo()
	{
		return "https"; 
	}
	
	// Let's configure additional connector to enable support for both HTTP and HTTPS
	

}
