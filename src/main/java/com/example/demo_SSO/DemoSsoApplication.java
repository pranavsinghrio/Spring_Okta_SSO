package com.example.demo_SSO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
@RestController
@SpringBootApplication
@EnableOAuth2Sso
public class DemoSsoApplication {

	@GetMapping("/")
	public String welcome2User(Principal principal) {
		return "Hi "+principal.getName()+" Welcome to JUSTRANSFORM";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSsoApplication.class, args);
	}

}
