package cn.liondance.liondancegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LionDanceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LionDanceGatewayApplication.class, args);
    }

}
