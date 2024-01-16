package org.example.dbrelatedentities.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "user")
@Data
@NoArgsConstructor

public class User {
    @Id
    @Column(name = "cin", nullable = false, unique = true, updatable = false)
    private String cin;

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String emploi;
    private String adresse;
    private int nbreEnfants;
    private String statutMarital;
    private float revenue;
    private String email;
    private String role="ROLE_CLIENT";
    private String typeAssurance;
    private String adresseWallet;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Assurance> assurances;

}