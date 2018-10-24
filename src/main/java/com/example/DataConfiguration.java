package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Mohsen on 18/10/24.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.example.repository")
public class DataConfiguration {

}
