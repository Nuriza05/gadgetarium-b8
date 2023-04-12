package com.example.gadgetariumb8.db.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "brands")
@NoArgsConstructor
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_seq")
    @SequenceGenerator(name = "brand_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String logo;

    public Brand(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }
}