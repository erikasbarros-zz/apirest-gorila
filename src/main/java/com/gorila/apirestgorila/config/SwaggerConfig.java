package com.gorila.apirestgorila.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //para o spring saber que é uma classe de configuração
@EnableSwagger2

public class SwaggerConfig {
	
	@Bean
    public Docket productApi() { //classe externa
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gorila.apirestgorila"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() { //minhas infos :)

        ApiInfo apiInfo = new ApiInfo(
                "Produtos API REST",
                "API REST de cadastro de investimentos.",
                "1.0",
                "Terms of Service",
                new Contact("Érika Barros", "https://www.linkedin.com/in/erikasbarros", "sbarros.erika@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }

}
