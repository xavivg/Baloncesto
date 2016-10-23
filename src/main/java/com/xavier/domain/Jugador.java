package com.xavier.domain;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by xavivg on 23/10/2016.
 */
@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int canastas;
    private int numAsistencias;
    private int rebotes;
    private String posicion;

    public Jugador(){

    }

    public Jugador(String nombre, LocalDate fechaNacimiento, int canastas, int numAsistencias, int rebotes, String posicion) {

        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.canastas = canastas;
        this.numAsistencias = numAsistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public int getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(int numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", canastas=" + canastas +
                ", numAsistencias=" + numAsistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
