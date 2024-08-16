package com.cola.librarymanagementapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration class for setting up Swagger documentation for the API.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * Creates and configures a Docket bean for generating Swagger API docs.
     * @return A Docket object configured with Swagger 2 settings.
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cola.librarymanagementapi"))
                .paths(PathSelectors.any())
                .build();
    }
}