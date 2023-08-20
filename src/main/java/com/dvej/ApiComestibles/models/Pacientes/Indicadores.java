package com.dvej.ApiComestibles.models.Pacientes;

import jakarta.persistence.*;

@Entity
@Table(name = "indicadores")
public class Indicadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "talla")
    private float talla;
    @Column(name = "peso")
    private float peso;
    @Column(name = "cintura")
    private float cintura;
    @Column(name = "brazo")
    private float brazo;
    @Column(name = "pierna")
    private float pierna;
    @Column(name = "gluteos")
    private float gluteos;
    @Column(name = "fecha")
    private String fecha;
    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    public Indicadores() {
    }

    public Indicadores(float talla, float peso, float cintura, float brazo, float pierna, float gluteos, String fecha, Paciente paciente) {
        this.talla = talla;
        this.peso = peso;
        this.cintura = cintura;
        this.brazo = brazo;
        this.pierna = pierna;
        this.gluteos = gluteos;
        this.fecha = fecha;
        this.paciente = paciente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float fosforo) {
        this.talla = fosforo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getCintura() {
        return cintura;
    }

    public void setCintura(float cintura) {
        this.cintura = cintura;
    }

    public float getBrazo() {
        return brazo;
    }

    public void setBrazo(float brazo) {
        this.brazo = brazo;
    }

    public float getPierna() {
        return pierna;
    }

    public void setPierna(float pierna) {
        this.pierna = pierna;
    }

    public float getGluteos() {
        return gluteos;
    }

    public void setGluteos(float gluteos) {
        this.gluteos = gluteos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
