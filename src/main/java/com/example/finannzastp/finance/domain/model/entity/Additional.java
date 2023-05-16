package com.example.finannzastp.finance.domain.model.entity;

import com.example.finannzastp.finance.domain.model.enumeration.Additionals;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "additional")
public class Additional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Additionals name;

    @OneToMany(mappedBy = "additional", cascade = CascadeType.ALL)
    private List<Property> properties;
}
