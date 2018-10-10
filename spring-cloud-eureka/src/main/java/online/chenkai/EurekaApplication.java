package online.chenkai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        try {
//            new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);
            SpringApplication.run( EurekaApplication.class, args );
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
