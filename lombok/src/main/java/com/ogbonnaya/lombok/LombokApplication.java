package com.ogbonnaya.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {

		SpringApplication.run(LombokApplication.class, args);

		Student student = new Student("oge", "oge", "hj");
		student.setFirstName("oge");
		student.setLastName("Ogeeee");
		student.setEmail("test@gmail");
	}


}
