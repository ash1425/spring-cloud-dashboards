package com.example.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientAApplication {
    @RequestMapping( "/" )
    public String getName() {
        return "a";
    }

    public static void main( String[] args ) {
        SpringApplication.run( ClientAApplication.class, args );
    }
}
