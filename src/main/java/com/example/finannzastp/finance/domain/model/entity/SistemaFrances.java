package com.example.finannzastp.finance.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sistema")
public class SistemaFrances {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private double montoPrestamo;
    private double tasaInteresAnual;
    private int cantidadCuotas;
    private LocalDate fechaInicio;
    private double valorCuota;
    private double totalIntereses;
    private double totalPagar;
}
