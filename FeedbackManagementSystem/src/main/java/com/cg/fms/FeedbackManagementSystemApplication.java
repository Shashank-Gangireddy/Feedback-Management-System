package com.cg.fms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
public class FeedbackManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackManagementSystemApplication.class, args);
		System.out.println("Running");
	}

}
