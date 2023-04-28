package com.example.finannzastp.finance.mapping;

import com.example.finannzastp.finance.domain.service.SistemaFrancesService;
import com.example.finannzastp.finance.mapping.SistemaFrancesMapper;
import com.example.finannzastp.user.mapping.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("securityMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public UserMapper userMapper() {
        return new UserMapper();
    }
    public SistemaFrancesMapper sistemaFrancesMapper(){
        return new SistemaFrancesMapper();
    }
}
