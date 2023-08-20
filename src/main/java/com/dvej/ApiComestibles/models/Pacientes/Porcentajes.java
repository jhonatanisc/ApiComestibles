package com.dvej.ApiComestibles.models.Pacientes;

import jakarta.persistence.*;

@Entity
@Table(name = "porcentajes")
public class Porcentajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "masa_muscular")
    private String masaMuscular;
    @Column(name = "masaGrasa")
    private String masaGrasa;
    @Column(name = "masaOsea")
    private String masaOsea;
    @Column(name = "agua")
    private String agua;
    @Column(name = "fecha")
    private String fecha;
    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;
}
