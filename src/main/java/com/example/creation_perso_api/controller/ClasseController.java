package com.example.creation_perso_api.controller;

import com.example.creation_perso_api.Entity.Classe;
import com.example.creation_perso_api.Entity.Compatibilite;
import com.example.creation_perso_api.service.ClasseService;
import com.example.creation_perso_api.service.CompatibiliteService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/classe")
@CrossOrigin(origins = "http://localhost:5173")
public class ClasseController {
    private ClasseService classeService;
    private CompatibiliteService compatibiliteService;

    public ClasseController(
            ClasseService classeService,
            CompatibiliteService compatibiliteService
    ) {
        this.classeService = classeService;
        this.compatibiliteService = compatibiliteService;
    }

    @GetMapping("")
    public List<Classe> getClasse() {
        return classeService.getAllClasse();
    }

    @GetMapping("/{name}")
    public Classe getClasseByName(@PathVariable String name) {
        return classeService.getClasseByName(name);
    }

    @GetMapping("/forRace/{race}")
    public List<Classe> getClasseforRace(@PathVariable String race) {
        List<Compatibilite> compatibilities = this.compatibiliteService.getCompatibilitiesForRace(race);
        List<Classe> classes = new ArrayList<>();
        for (Compatibilite compatibility : compatibilities) {
            classes.add(this.classeService.getClasseByName(compatibility.getClasse()));
        }
        return classes;
    }
}
