package com.example.creation_perso_api.mapper;

import com.example.creation_perso_api.Entity.Caracteristique;
import com.example.creation_perso_api.dto.CaracteristiqueDto;

public class CaracteristiqueMapper {
    public static CaracteristiqueDto toDto(Caracteristique caracteristique) {
        CaracteristiqueDto caracteristiqueDto = new CaracteristiqueDto();
        caracteristiqueDto.setAdrMin(caracteristique.getAdrMin());
        caracteristiqueDto.setAdrMax(caracteristique.getAdrMax());
        caracteristiqueDto.setChaMin(caracteristique.getChaMin());
        caracteristiqueDto.setChaMax(caracteristique.getChaMax());
        caracteristiqueDto.setCouMin(caracteristique.getCouMin());
        caracteristiqueDto.setCouMax(caracteristique.getCouMax());
        caracteristiqueDto.setFoMin(caracteristique.getFoMin());
        caracteristiqueDto.setFoMax(caracteristique.getFoMax());
        caracteristiqueDto.setIntMin(caracteristique.getIntMin());
        caracteristiqueDto.setIntMax(caracteristique.getIntMax());
        return caracteristiqueDto;
    }

    public static Caracteristique toEntity(CaracteristiqueDto caracteristiqueDto) {
        Caracteristique caracteristique = new Caracteristique();
        caracteristique.setAdrMin(caracteristiqueDto.getAdrMin());
        caracteristique.setAdrMax(caracteristiqueDto.getAdrMax());
        caracteristique.setChaMin(caracteristiqueDto.getChaMin());
        caracteristique.setChaMax(caracteristiqueDto.getChaMax());
        caracteristique.setCouMin(caracteristiqueDto.getCouMin());
        caracteristique.setCouMax(caracteristiqueDto.getCouMax());
        caracteristique.setFoMin(caracteristiqueDto.getFoMin());
        caracteristique.setFoMax(caracteristiqueDto.getFoMax());
        caracteristique.setIntMin(caracteristiqueDto.getIntMin());
        caracteristique.setIntMax(caracteristiqueDto.getIntMax());
        return caracteristique;
    }
}
