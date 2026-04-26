package br.com.pferreira.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Pedro Ferreira
 */

@Configuration
@EnableMongoRepositories(basePackages = "")
public class MongoConfig {
}
