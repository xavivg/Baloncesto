package com.xavier.service;

import com.xavier.domain.Jugador;
import com.xavier.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by xavivg on 23/10/2016.
 */
@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;


    public void crearJugadores(){

        Jugador jordan = new Jugador("Michael Jordan", LocalDate.of(1970,5,10),150,100,50,"Escolta");
        jugadorRepository.save(jordan);
        System.out.println(jugadorRepository.findByNombreLike("jordan"));
    }
}
