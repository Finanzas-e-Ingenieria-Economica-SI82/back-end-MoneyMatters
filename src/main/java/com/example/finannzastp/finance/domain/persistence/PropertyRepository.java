package com.example.finannzastp.finance.domain.persistence;

import com.example.finannzastp.finance.domain.model.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findAllByPrice(Double price);
}
