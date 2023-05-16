package com.example.finannzastp.finance.domain.service;

import com.example.finannzastp.finance.domain.model.entity.Additional;

import java.util.List;

public interface AdditionalService {
    void seed();

    List<Additional> getAll();

}
