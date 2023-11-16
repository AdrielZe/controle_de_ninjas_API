package com.ninja.exame_chunnin.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ninja")

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ninja",nullable = false)
    private Long id_ninja;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "vila", nullable = false)
    private String vila;
    @Column(name = "status",nullable = false)
    private boolean status;
    @Column(name = "niveldeexperiencia", nullable = false)
    private String nivelDeExperiencia;
}
