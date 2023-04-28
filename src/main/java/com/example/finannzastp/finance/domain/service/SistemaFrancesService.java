package com.example.finannzastp.finance.domain.service;

import com.example.finannzastp.finance.domain.model.entity.SistemaFrances;

public interface SistemaFrancesService {
    SistemaFrances calcularPrestamoFrances(double monto, double tasaInteresAnual, int plazoMeses);
}
