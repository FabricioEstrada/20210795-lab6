package org.example.lab6_20210795.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name="peliculas")
@Getter
@Setter
public class Peliculas {

    @Id
    @Column(name="peliculaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private Date fechaEstreno;
    private Integer duracionMinutos;
}
