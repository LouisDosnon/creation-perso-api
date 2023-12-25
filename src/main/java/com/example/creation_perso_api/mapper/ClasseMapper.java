package com.example.creation_perso_api.mapper;

import com.example.creation_perso_api.Entity.Classe;
import com.example.creation_perso_api.dto.ClasseDto;

public class ClasseMapper {
    public static ClasseDto toDto(Classe classe) {
        ClasseDto classeDto = new ClasseDto();
        classeDto.setCaracteristique(CaracteristiqueMapper.toDto(classe.getCaracteristique()));
        classeDto.setName(classe.getName());
        classeDto.setCompetences(classe.getCompetences());
        return classeDto;
    }

    public static Classe toEntity(ClasseDto classeDto) {
        Classe classe = new Classe();
        classe.setCaracteristique(CaracteristiqueMapper.toEntity(classeDto.getCaracteristique()));
        classe.setName(classeDto.getName());
        classe.setCompetences(classeDto.getCompetences());
        return classe;
    }
}
