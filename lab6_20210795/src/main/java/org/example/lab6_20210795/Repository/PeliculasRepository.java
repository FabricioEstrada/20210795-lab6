package org.example.lab6_20210795.Repository;

import org.example.lab6_20210795.Entity.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculasRepository extends JpaRepository<Peliculas, Integer> {
}
