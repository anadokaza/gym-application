/*package com.example.demo;

import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User user1 = new User(1L, "ana", "pass1", "ana@gmail.com");
            User user2 = new User(2L, "gorazd", "pass2", "gorazd@gmail.com");
            repository.saveAll(
                    List.of(user1, user2)
            );
        };
    }
}*/
