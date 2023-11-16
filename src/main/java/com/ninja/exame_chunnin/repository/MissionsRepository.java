package com.ninja.exame_chunnin.repository;

import com.ninja.exame_chunnin.model.MissionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissionsRepository extends JpaRepository<MissionModel, Long> {
    List<MissionModel> findByTipoDeMissaoAndNinjaResponsavel_nivelDeExperiencia(String tipoDeMissao,String nivelDeExperiencia);
}
