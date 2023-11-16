package com.ninja.exame_chunnin.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "missoes")

public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_missao",nullable = false)
    private Long id_missao;
    @Column(name = "classificacao",nullable = false)
    private char classificacao;
    @Column(name = "tipo_de_missao", nullable = false)
    private String tipoDeMissao;
    @Column(name = "status",nullable = false)
    private boolean status;

    @OneToOne
    @JoinColumn(name = "id_ninja")
    private NinjaModel ninjaResponsavel;
}