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
    private int numeroAsistencias;
    private int rebotes;
    private String posicion;

    public Jugador(String nombre, LocalDate fechaNacimiento, int canastas, int numeroAsistencias, int rebotes, String posicion) {

        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.canastas = canastas;
        this.numeroAsistencias = numeroAsistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
    }
    public Jugador(){

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

    public int getNumeroAsistencias() {
        return numeroAsistencias;
    }

    public void setNumeroAsistencias(int numeroAsistencias) {
        this.numeroAsistencias = numeroAsistencias;
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
                ", numeroAsistencias=" + numeroAsistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
