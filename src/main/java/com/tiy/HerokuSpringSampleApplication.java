package com.tiy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HerokuSpringSampleApplication {

	public static void main(String[] args) {

		System.out.println("**********************************************"); 
		System.out.println("JDBC_DATABASE_URL = " + System.getenv("JDBC_DATABASE_URL")); 
		System.out.println("DATABASE_URL = " + System.getenv("DATABASE_URL")); 
		System.out.println("**********************************************"); 

		SpringApplication.run(HerokuSpringSampleApplication.class, args);
	}
}
