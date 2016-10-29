package com.xavier.service;

import com.xavier.domain.Equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xavier.repository.EquipoRepository;

import java.time.LocalDate;

/**
 * Created by xavivg on 23/10/2016.
 */
@Service
public class EquipoService {
    @Autowired
    EquipoRepository equipoRepository;

    public void insertarEquipos() {
/**
 * EQUIPOS TO DO
 */
    Equipo dalas = new Equipo("Dalas Mavericks","Dalas City",  LocalDate.of(1870,5,10));
    equipoRepository.save(dalas);
    }
}