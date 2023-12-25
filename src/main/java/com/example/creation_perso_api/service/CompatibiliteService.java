package com.example.creation_perso_api.service;

import com.example.creation_perso_api.Entity.Compatibilite;

import java.util.List;

public interface CompatibiliteService {
    List<Compatibilite> getAllCompatibilities();

    List<Compatibilite> getCompatibilitiesForClasse(String classe);

    List<Compatibilite> getCompatibilitiesForRace(String Race);
}
