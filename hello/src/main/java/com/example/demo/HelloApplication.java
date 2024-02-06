package com.example.demo;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
 @GetMapping
	public String status()throws UnknownHostException, java.net.UnknownHostException
	{
	 return "ststus-up"+InetAddress.getLocalHost().toString();
	 }

}
