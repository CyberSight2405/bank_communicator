package com.hakaton.bank_communicator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BankCommunicatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankCommunicatorApplication.class, args);
	}

}
