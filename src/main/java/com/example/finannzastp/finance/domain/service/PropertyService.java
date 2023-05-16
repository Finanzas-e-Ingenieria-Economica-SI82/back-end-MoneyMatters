package com.example.finannzastp.finance.domain.service;

import com.example.finannzastp.finance.domain.model.entity.Property;

import java.util.List;

public interface PropertyService {
    List<Property> GetAll();
    List<Property> getTripByPrice(Double price);
    Property create(Property trip);
    List<Property> getTripByType(String name);
}
