package com.example.finannzastp.finance.mapping;

import com.example.finannzastp.user.mapping.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("securityMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public UserMapper userMapper() {
        return new UserMapper();
    }
    public PaymentPlanMapper paymentPlanMapper(){
        return new PaymentPlanMapper();
    }
    public PropertyMapper propertyMapper(){ return new PropertyMapper();}
}
