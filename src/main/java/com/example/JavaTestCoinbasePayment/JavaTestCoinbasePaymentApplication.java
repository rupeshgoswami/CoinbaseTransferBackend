package com.example.JavaTestCoinbasePayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JavaTestCoinbasePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTestCoinbasePaymentApplication.class, args);
	}

}
