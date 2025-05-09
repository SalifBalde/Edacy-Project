package com.fouladouhitech.demoedacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@Configuration
public class DemoEdacyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEdacyApplication.class, args);
    }


}
