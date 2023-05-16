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
@Table(name = "credit")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private double propertyValue;

    @Column(nullable = false)
    private double interestRate;

    @Column(nullable = false)
    private int startAmount;

    @Column(nullable = false)
    private int timeLimit;

    @Column(nullable = false)
    private int extraTime;

}
