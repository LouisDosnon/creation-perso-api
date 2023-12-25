package com.example.creation_perso_api.controller;

import com.example.creation_perso_api.Entity.Compatibilite;
import com.example.creation_perso_api.service.CompatibiliteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compatibilite")
@CrossOrigin(origins = "http://localhost:5173")
public class CompatibiliteController {
    private CompatibiliteService compatibiliteService;

    public CompatibiliteController(CompatibiliteService compatibiliteService) {
        this.compatibiliteService = compatibiliteService;
    }

    @GetMapping("")
    public List<Compatibilite> getCompatibilite() {
        return compatibiliteService.getAllCompatibilities();
    }

    @GetMapping("/forClasse/{classe}")
    public List<Compatibilite> getCompatibiliteforClasse(@PathVariable String classe) {
        return compatibiliteService.getCompatibilitiesForClasse(classe);
    }

    @GetMapping("/forRace/{race}")
    public List<Compatibilite> getCompatibiliteforRace(@PathVariable String race) {
        return compatibiliteService.getCompatibilitiesForRace(race);
    }
}
