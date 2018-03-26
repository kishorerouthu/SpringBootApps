package com.css.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class FirstApp {

   @RequestMapping("/")
   String home() {
	return "Spring boot first app welcomes you...!";
   }

  public static void main(String args[]) throws Exception {
	//SpringApplication.run(FirstApp.class, args);
      SpringApplication application = new SpringApplication(FirstApp.class);
      //application.setBannerMode(Banner.Mode.OFF);
      application.run(args);

      this.getClass().getClassLoader();
      Thread.currentThread().getContextClassLoader()

  }
}
