package com.okanuzun.springbootsoapclient;

import com.okanuzun.springbootsoapclient.client.CountryClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.okanuzun.springbootsoapclient.wsdl.*;

@SpringBootApplication
public class SpringBootSoapClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClientApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(CountryClient quoteClient) {
		return args -> {
			String country = "Spain";
//
//			if (args.length > 0) {
//				country = args[0];
//			}
			GetCountryResponse response = quoteClient.getCountry(country);
			System.err.println(response.getCountry().getName());

			Currency currency = Currency.valueOf("TRY");

//			if (args.length > 0) {
//				country = args[0];
//			}

			response = quoteClient.getCountry(currency);
			System.err.println(response.getCountry().getName());
		};
	}


}
