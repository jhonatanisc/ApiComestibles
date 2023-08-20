package com.dvej.ApiComestibles.models.Pacientes;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Column(name = "ocupacion")
    private String ocupacion;
    @Column(name = "nivel_actividad")
    private String nivelActividad;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(cascade = ALL, mappedBy = "paciente")
    private Set<Indicadores> indicadores = new HashSet<>();
    @OneToMany(cascade = ALL, mappedBy = "paciente")
    private Set<Porcentajes> porcentajes = new HashSet<>();
    @OneToMany(cascade = ALL, mappedBy = "paciente")
    private Set<Particularidades> particularidades = new HashSet<>();




}
