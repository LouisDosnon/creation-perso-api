package com.example.creation_perso_api.mapper;

import com.example.creation_perso_api.Entity.Race;
import com.example.creation_perso_api.dto.RaceDto;

public class RaceMapper {
    public static RaceDto toDto(Race race) {
        RaceDto raceDto = new RaceDto();
        raceDto.setCaracteristique(CaracteristiqueMapper.toDto(race.getCaracteristique()));
        raceDto.setName(race.getName());
        raceDto.setCompetences(race.getCompetences());
        return raceDto;
    }

    public static Race toEntity(RaceDto raceDto) {
        Race race = new Race();
        race.setCaracteristique(CaracteristiqueMapper.toEntity(raceDto.getCaracteristique()));
        race.setName(raceDto.getName());
        race.setCompetences(raceDto.getCompetences());
        return race;
    }
}
