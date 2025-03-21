package vn.edu.iuh.fit.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsMavenApplication {

    public static void main(String[] args) {
        System.out.println("Hello Jenkins Maven");
        SpringApplication.run(JenkinsMavenApplication.class, args);
    }

}
