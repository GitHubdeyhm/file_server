package learn.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FileApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FileApplication.class).run(args);

        //SpringApplication.run(FileApplication.class, args);
    }
}
