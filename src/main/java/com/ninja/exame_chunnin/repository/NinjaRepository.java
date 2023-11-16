package com.ninja.exame_chunnin.repository;

import com.ninja.exame_chunnin.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NinjaRepository extends JpaRepository<NinjaModel,Long> {
    List<NinjaModel> findBynivelDeExperiencia(String nivelDeExperiencia);
}
