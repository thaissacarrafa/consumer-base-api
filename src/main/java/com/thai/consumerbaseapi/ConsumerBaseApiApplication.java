package com.thai.consumerbaseapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerBaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerBaseApiApplication.class, args);
	}

}
