package com.ninja.exame_chunnin.controller;

import com.ninja.exame_chunnin.model.MissionModel;
import com.ninja.exame_chunnin.repository.MissionsRepository;
import com.ninja.exame_chunnin.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/api/missao")
public class MissionsController {
    @Autowired
    private MissionsRepository missionsRepository;

    @Autowired
    private NinjaRepository ninjaRepository;

    @GetMapping("/resgate/srank")
    public ResponseEntity<List<MissionModel>> getMissaoResgateSrank(){
        List<MissionModel> missionList = missionsRepository.findByTipoDeMissaoAndNinjaResponsavel_nivelDeExperiencia("Resgate","S");
        return new ResponseEntity<>(missionList, HttpStatus.OK);
    }
}


