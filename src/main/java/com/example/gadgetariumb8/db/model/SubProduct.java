package com.example.gadgetariumb8.db.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.CascadeType.DETACH;

@Getter
@Setter
@Entity
@Table(name = "sub_products")
@NoArgsConstructor
public class SubProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sub_product_seq")
    @SequenceGenerator(name = "sub_product_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    private String colour;
    @ElementCollection
    private List<String> images;
    private BigDecimal price;
    private int quantity;
    @ElementCollection
    private Map<String,String>characteristics;
    @ManyToOne(cascade = {REFRESH,PERSIST,MERGE,DETACH})
    @JoinColumn(name = "product_id")
    private Product product;

    public SubProduct(String colour,  BigDecimal price, int quantity) {
        this.colour = colour;
        this.price = price;
        this.quantity = quantity;

    }
}