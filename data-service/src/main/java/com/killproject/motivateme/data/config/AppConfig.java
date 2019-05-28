package com.killproject.motivateme.data.config;

import com.killproject.motivateme.data.dto.Promise;
import com.killproject.motivateme.data.dto.User;
import com.killproject.motivateme.data.repository.PromiseRepository;
import com.killproject.motivateme.data.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.killproject.motivateme.data.repository")
public class AppConfig {

    private static final Logger log = LoggerFactory.getLogger(AppConfig.class);

    @Bean
    public CommandLineRunner demo(UserRepository userRepository,
                                  PromiseRepository promiseRepository) {
        return (args -> {
            log.info("Users are creating..");
            log.info("-------------------------------");
            userRepository.save(new User("Vova", 24));
            userRepository.save(new User("Petya", 20));

            log.info("Users found with findAll():");
            userRepository.findAll().forEach(user -> log.info(user.toString()));
            log.info("---------------------------------------------------------");


            log.info("Promises are creating..");
            log.info("-------------------------------");
            promiseRepository.save(new Promise("Read books", "qweqwew"));
            promiseRepository.save(new Promise("Run every day", "xcvxcvxcv"));

            log.info("Promises found with findAll():");
            promiseRepository.findAll().forEach(promise -> log.info(promise.toString()));
            log.info("-------------------------------");
        });
    }
}
