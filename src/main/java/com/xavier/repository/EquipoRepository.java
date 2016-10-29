package com.xavier.repository;

import com.xavier.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xavivg on 17/10/2016.
 */

public interface EquipoRepository extends JpaRepository<Equipo,Long> {
    Equipo findByNombre(String nombre);
    Equipo findByNombreLike(String nombre);
    List<Equipo> findByLocalidad(String loc);

}
