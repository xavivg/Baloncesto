package com.xavier.service;

import com.xavier.domain.Equipo;
import com.xavier.domain.Jugador;
import com.xavier.repository.EquipoRepository;
import com.xavier.repository.JugadorRepository;
import org.hibernate.annotations.SourceType;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by xavivg on 23/10/2016.
 */
@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void crearJugadores(){


        /** ------------JUGADORES CREADOS--------------------------------------- */

        Jugador jordan = new Jugador("Michael Jordan", LocalDate.of(1970,5,10),150,100,50,"Escolta");
        Jugador lebron = new Jugador("Lebron James", LocalDate.of(1970,5,10),200,70,60,"Pivot");
        Jugador oneal = new Jugador("Shaquille Oneal", LocalDate.of(1970,5,10),45,72,60,"Alero");
        Jugador kobe = new Jugador("Kobe bryant", LocalDate.of(1970,5,10),120,120,120,"Base");
        Jugador Bird = new Jugador("Larry Bird", LocalDate.of(1970,5,10),215,114,30,"Ala-pivot");
        Jugador mjonson = new Jugador("Magic Jonson", LocalDate.of(1970,5,10),200,187,78,"Escolta");
        Jugador curry = new Jugador("Stephen Curry", LocalDate.of(1970,5,10),140,200,60,"Pivot");
        Jugador wade = new Jugador("Dwyane Wade", LocalDate.of(1970,5,10),120,150,160,"Alero");
        Jugador carmelo = new Jugador("Carmelo Anthony", LocalDate.of(1970,5,10),45,50,70,"Base");
        Jugador malone = new Jugador("Karl Malone", LocalDate.of(1970,5,10),80,70,150,"Ala-pivot");




        /** --------------------------------------------------------------------- */
        /** --------------------------------------------------------------------- */




        /** ------------JUGADORES AÑADIDOS A EQUIPOS----------------------------- */

        jordan.setEquipo(equipoRepository.findByNombre("Dallas Mavericks"));
        lebron.setEquipo(equipoRepository.findByNombre("Minnesota Timberwolves"));
        oneal.setEquipo(equipoRepository.findByNombre("Los Angeles Lakers"));
        kobe.setEquipo(equipoRepository.findByNombre("Los Angeles Lakers"));
        Bird.setEquipo(equipoRepository.findByNombre("San Antonio Spurs"));
        mjonson.setEquipo(equipoRepository.findByNombre("San Antonio Spurs"));
        curry.setEquipo(equipoRepository.findByNombre("Chicago Bulls"));
        wade.setEquipo(equipoRepository.findByNombre("Chicago Bulls"));
        carmelo.setEquipo(equipoRepository.findByNombre("Minnesota Timberwolves"));
        malone.setEquipo(equipoRepository.findByNombre("Los Angeles Lakers"));




        /** --------------------------------------------------------------------- */
        /** --------------------------------------------------------------------- */




        /** ----------------------SAVE--------------------------------- */
        jugadorRepository.save(jordan);
        jugadorRepository.save(lebron);
        jugadorRepository.save(oneal);
        jugadorRepository.save(kobe);
        jugadorRepository.save(Bird);
        jugadorRepository.save(mjonson);
        jugadorRepository.save(curry);
        jugadorRepository.save(wade);
        jugadorRepository.save(carmelo);
        jugadorRepository.save(malone);

        /** --------------------------------------------------------------------- */
        /** --------------------------------------------------------------------- */




        /** ----------------------QUERIES--------------------------------- */
        System.out.println("Buscar por nombre");
        System.out.println(jugadorRepository.findByNombreLike("jordan"));
        System.out.println("Igual o mas de 40 canastas");
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(40));
        System.out.println("Jugadores con asistencias de 50 a 80");
        System.out.println(jugadorRepository.findByNumeroAsistenciasBetween(100,130));
        System.out.println("Jugadores de una posicion especifica: Base");
        System.out.println(jugadorRepository.findByPosicion("Base"));
        System.out.println("Jugadores Nacidos antes del 1990");
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1990,1,1)));
        /** ----------------------FALTAN 2--------------------------------- */


        System.out.println("Equipos de la localidad de Los Angeles");
        System.out.println(equipoRepository.findByLocalidad("Dallas city"));
        System.out.println("Jugadores del equipo SPURS");
        List<Jugador> listaJugadoresPorEquipo = jugadorRepository.findByEquipo(equipoRepository.findByNombre("Dallas Mavericks"));
        for (Jugador jugador: listaJugadoresPorEquipo) {
            System.out.println("- "+jugador);
        }
    }
}
