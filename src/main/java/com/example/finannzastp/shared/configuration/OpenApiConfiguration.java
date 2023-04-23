package com.example.finannzastp.shared.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("MoneyMatters API")
                        .version("1.0.0")
                        .termsOfService("https://moneymatters.com/tos")
                        .license(new License().name("Apache 2.0 License").url("https://moneymatters.com/license"))
                        .contact(new Contact()
                                .url("https://moneymatters.studio")
                                .name("MONEYMATTERS.studio")));
    }
}
