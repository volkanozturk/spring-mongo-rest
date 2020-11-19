package com.volkanozturk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author volkanozturk
 */
@SpringBootApplication
@EnableMongoRepositories
public class SpringMongoRestApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringMongoRestApplication.class, args);
  }
}