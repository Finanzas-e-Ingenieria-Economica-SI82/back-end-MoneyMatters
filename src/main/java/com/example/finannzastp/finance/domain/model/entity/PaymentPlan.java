package com.example.finannzastp.finance.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment_plan")
public class PaymentPlan{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private double balance;

    @Column(nullable = false)
    private double TEM;

    @Column(nullable = false)
    private int installments;

    @Column(nullable = false)
    private double VAN;

    @Column(nullable = false)
    private double TIR;


}
