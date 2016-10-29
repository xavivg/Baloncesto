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
    Equipo dallas = new Equipo("Dallas Mavericks","Dallas City",  LocalDate.of(1870,5,10));
    Equipo minesota = new Equipo("Minnesota Timberwolves","Minnesota city",LocalDate.of(1989,5,4));
    Equipo lakers = new Equipo("Los Angeles Lakers","Los Angeles",LocalDate.of(1890,5,4));
    Equipo spurs = new Equipo("San Antonio Spurs","San Antonio",LocalDate.of(1959,1,2));
    Equipo chicago = new Equipo("Chicago Bulls","Chicago",LocalDate.of(1940,3,1));



    equipoRepository.save(dallas);
    equipoRepository.save(minesota);
    equipoRepository.save(lakers);
    equipoRepository.save(spurs);
    equipoRepository.save(chicago);


    }
}