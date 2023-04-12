package com.example.gadgetariumb8.db.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "malling_list")
@NoArgsConstructor

public class MallingList {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "malling_list_seq")
    @SequenceGenerator(name = "malling_list_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String image;
    private String name;
    private String description;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;

    public MallingList(String image, String name, String description, LocalDate dateOfStart, LocalDate dateOfFinish) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }
}