package com.dvej.ApiComestibles.models.Alimentos;

import jakarta.persistence.*;

@Entity
@Table(name = "grupos_alimenticios_catalogo")
public class GrupoAlimenticio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre")
    private String nombre;

    public GrupoAlimenticio() {
    }

    public GrupoAlimenticio(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
