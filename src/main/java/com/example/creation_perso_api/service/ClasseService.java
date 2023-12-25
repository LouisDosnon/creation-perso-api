package com.example.creation_perso_api.service;

import com.example.creation_perso_api.Entity.Classe;

import java.util.List;

public interface ClasseService {
    List<Classe> getAllClasse();
    Classe getClasseByName(String name);
}
