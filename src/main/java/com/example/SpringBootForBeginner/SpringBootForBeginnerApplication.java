package com.example.SpringBootForBeginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController

public class SpringBootForBeginnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootForBeginnerApplication.class, args);
	}


	@GetMapping("/hello")
	public GreetResponse hello(){

		GreetResponse response = new GreetResponse(
				"welcome to spirngboot",
				List.of("Alex","Bopha","Jesica"),
				new Person("Sopheary Sofia")
		);

		return response;
	}


	record Person(String name){

	}
	record GreetResponse(
			String greet,
			List<String> programmings,
			Person person

	){

	}

//	class  GreetResponse{
//		public final String greet;
//
//		public GreetResponse(String greet) {
//			this.greet = greet;
//		}
//
//		public String getGreet() {
//			return greet;
//		}
//	}

}
