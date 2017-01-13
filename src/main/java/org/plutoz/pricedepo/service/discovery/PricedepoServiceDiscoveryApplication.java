package org.plutoz.pricedepo.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PricedepoServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricedepoServiceDiscoveryApplication.class, args);
	}
}
