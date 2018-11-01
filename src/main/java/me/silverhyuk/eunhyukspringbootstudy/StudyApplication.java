package me.silverhyuk.eunhyukspringbootstudy;

import me.silverhyuk.eunhyukspringbootstater.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StudyApplication.class, args);
		SpringApplication springApplication = new SpringApplication(StudyApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		springApplication.run(args);
	}


}
