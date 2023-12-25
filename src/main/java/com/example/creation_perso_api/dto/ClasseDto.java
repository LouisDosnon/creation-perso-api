package com.example.creation_perso_api.dto;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "classe")
public class ClasseDto {
    private String name;
    private CaracteristiqueDto caracteristique;
    private List<String> competences;
}
