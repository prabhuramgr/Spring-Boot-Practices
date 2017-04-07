package hello;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class Application {
    
    public static void main(String[] args) {
        SpringApplication eurekaServer = new SpringApplication(Application.class);
        eurekaServer.addListeners(new ApplicationPidFileWriter("eureka-server.pid"));
        eurekaServer.run();
    }

}
