package com.example.finannzastp.finance.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class SistemaFrancesResource {
    private double montoPrestamo;
    private double tasaInteresAnual;
    private int cantidadCuotas;
}
