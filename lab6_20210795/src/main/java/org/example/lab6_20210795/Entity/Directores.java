package org.example.lab6_20210795.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name="directores")
@Getter
@Setter
public class Directores {

    @Id
    @Column(name="directorId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 100)
    private String nombre;
    @Column(name = "telefono", length = 9)
    private String telefono;
    @Column(name = "nacionalidad", length = 50)
    private String nacionalidad;

}
