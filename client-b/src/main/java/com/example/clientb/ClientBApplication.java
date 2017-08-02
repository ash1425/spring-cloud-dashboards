package com.example.clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientBApplication {

    @RequestMapping( "/" )
    public String getName() {
        return "b";
    }

    public static void main( String[] args ) {
        SpringApplication.run( ClientBApplication.class, args );
    }
}
