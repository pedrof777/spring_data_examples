package br.com.pferreira.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Pedro Ferreira
 */

@Configuration
@EnableJpaRepositories(basePackages = "br.com.pferreira.customer")
public class JpaConfig {

}
