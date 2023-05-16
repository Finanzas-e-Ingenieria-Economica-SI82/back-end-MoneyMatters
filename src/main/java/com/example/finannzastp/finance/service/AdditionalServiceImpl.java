package com.example.finannzastp.finance.service;

import com.example.finannzastp.finance.domain.model.entity.Additional;
import com.example.finannzastp.finance.domain.model.enumeration.Additionals;
import com.example.finannzastp.finance.domain.persistence.AdditionalRepository;
import com.example.finannzastp.finance.domain.service.AdditionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AdditionalServiceImpl implements AdditionalService {

    @Autowired
    private final AdditionalRepository additionalRepository;

    private static String[] DEFAULT_ADDITIONAL = {"LAVANDERIA", "GARAJE", "COMEDOR", "SALA", "PATIODEJUEGOS", "PISCINA", "JARDIN"};

    public AdditionalServiceImpl(AdditionalRepository additionalRepository) {
        this.additionalRepository = additionalRepository;
    }

    @Override
    public void seed() {
        Arrays.stream(DEFAULT_ADDITIONAL)
                .forEach(name -> {
                    Additionals additionalName = Additionals.valueOf(name);
                    if(!additionalRepository.existsByName(additionalName)) {
                        additionalRepository.save((new Additional()).withName(additionalName));
                    }
                });
    }

    @Override
    public List<Additional> getAll() {
        return additionalRepository.findAll();
    }
}
