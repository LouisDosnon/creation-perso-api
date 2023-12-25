package com.example.creation_perso_api.Entity;

import lombok.Data;

import java.util.List;

@Data
public class Race {
    private String name;
    private Caracteristique caracteristique;
    private List<String> competences;
}
