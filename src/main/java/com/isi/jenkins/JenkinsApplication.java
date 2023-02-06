package com.isi.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsApplication {
    @GetMapping
    public String message(){
        return "welcom diarra";
    }



    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

}
