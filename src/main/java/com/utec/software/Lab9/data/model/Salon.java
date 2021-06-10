package com.utec.software.Lab9.data.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String name;

    @OneToMany(mappedBy = "salon")
    public List<Estudiante> estudiantes;
}
