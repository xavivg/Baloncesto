package com.xavier.repository;

import com.xavier.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by xavivg on 23/10/2016.
 */

public interface JugadorRepository extends JpaRepository<Jugador,Long> {
    List<Jugador> findByNombreLike(String nombre);

}
