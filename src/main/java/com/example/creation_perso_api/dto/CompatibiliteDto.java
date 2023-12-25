package com.example.creation_perso_api.dto;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("compatibilite")
public class CompatibiliteDto {
    private String race, classe;
}
