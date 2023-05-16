package com.example.finannzastp.finance.domain.persistence;

import com.example.finannzastp.finance.domain.model.entity.Additional;
import com.example.finannzastp.finance.domain.model.enumeration.Additionals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdditionalRepository extends JpaRepository<Additional, Long> {
    Optional<Additional> findByName(Additionals name);

    boolean existsByName(Additionals name);
}
