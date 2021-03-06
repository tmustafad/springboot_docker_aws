package com.turkmen.springboot_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerApplication {


	@RequestMapping("/")
	public String sayHi(){
		return "Hi All....";
	}

	@RequestMapping("/turkmen")
	public String methodTurkmen(){
		return "Hello From AWS :))";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

}
