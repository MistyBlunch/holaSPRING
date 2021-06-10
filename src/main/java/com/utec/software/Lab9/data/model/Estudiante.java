package com.utec.software.Lab9.data.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String name;

    @ManyToOne
    public Salon salon;

    @ManyToMany(mappedBy = "estudiantes")
    public List<Curso> cursos;
}
