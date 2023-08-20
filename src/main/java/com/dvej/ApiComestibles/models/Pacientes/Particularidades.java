package com.dvej.ApiComestibles.models.Pacientes;

import jakarta.persistence.*;

@Entity
@Table(name = "particularidades")
public class Particularidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
    @Column(name = "apellido", nullable = false, unique = true)
    private String apellido;
    @Column(name = "fecha_nacimiento", nullable = false, unique = true)
    private String fechaNacimiento;
    @Column(name = "ocupacion", nullable = false, unique = true)
    private String ocupacion;
    @Column(name = "nivel_actividad", nullable = false, unique = true)
    private String nivelActividad;
    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;
}
