package com.example.creation_perso_api.mapper;

import com.example.creation_perso_api.Entity.Compatibilite;
import com.example.creation_perso_api.dto.CompatibiliteDto;

public class CompatibiliteMapper {
    public static CompatibiliteDto toDto(Compatibilite compatiblite) {
        CompatibiliteDto compatibliteDto = new CompatibiliteDto();
        compatibliteDto.setClasse(compatiblite.getClasse());
        compatibliteDto.setRace(compatiblite.getRace());
        return compatibliteDto;
    }

    public static Compatibilite toEntity(CompatibiliteDto compatibliteDto) {
        Compatibilite compatiblite = new Compatibilite();
        compatiblite.setClasse(compatibliteDto.getClasse());
        compatiblite.setRace(compatibliteDto.getRace());
        return compatiblite;
    }
}
