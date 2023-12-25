package com.example.creation_perso_api.controller;

import com.example.creation_perso_api.Entity.Compatibilite;
import com.example.creation_perso_api.Entity.Race;
import com.example.creation_perso_api.service.CompatibiliteService;
import com.example.creation_perso_api.service.RaceService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/race")
@CrossOrigin(origins = "http://localhost:5173")
public class RaceController {
    private RaceService raceService;

    private CompatibiliteService compatibiliteService;

    public RaceController(
            RaceService raceService,
            CompatibiliteService compatibiliteService
    ) {
        this.raceService = raceService;
        this.compatibiliteService = compatibiliteService;
    }

    @GetMapping("")
    public List<Race> getRace() {
        return raceService.getAllRace();
    }
    @GetMapping("/forClasse/{classe}")
    public List<Race> getRaceforClasse(@PathVariable String classe) {
        List<Compatibilite> compatibilities = this.compatibiliteService.getCompatibilitiesForClasse(classe);
        List<Race> races = new ArrayList<>();
        for (Compatibilite compatibility : compatibilities) {
            races.add(this.raceService.getRaceByName(compatibility.getRace()));
        }
        return races;
    }
}
