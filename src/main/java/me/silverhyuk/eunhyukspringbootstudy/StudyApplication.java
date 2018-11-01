package me.silverhyuk.eunhyukspringbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StudyApplication.class, args);
		SpringApplication springApplication = new SpringApplication(StudyApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		springApplication.run(args);
	}
}
