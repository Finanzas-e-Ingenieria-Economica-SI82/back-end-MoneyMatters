package com.example.finannzastp.finance.service;

import com.example.finannzastp.finance.domain.model.entity.SistemaFrances;
import com.example.finannzastp.finance.domain.service.SistemaFrancesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SistemaFrancesServiceImpl implements SistemaFrancesService {
    @Override
    public SistemaFrances calcularPrestamoFrances(double monto, double tasaInteresAnual, int plazoMeses) {
        return null;
    }
}
