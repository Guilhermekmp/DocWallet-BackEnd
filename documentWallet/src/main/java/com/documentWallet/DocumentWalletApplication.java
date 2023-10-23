package com.documentWallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableAutoConfiguration
public class DocumentWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentWalletApplication.class, args);
	}

}
