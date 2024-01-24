package org.example.dbrelatedentities.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "assurance")
@Data
@NoArgsConstructor
public class Assurance {
    @Id
    @Column(name="idAssurance",nullable = false,unique = true,updatable = false)
    private int idAssurance;

    private String typeAssurance;
    private String nom;
    private String description;
    private float prix;

    /*@ManyToOne
    @JoinColumn(name = "user_cin", nullable = false)
    private User user;*/
}