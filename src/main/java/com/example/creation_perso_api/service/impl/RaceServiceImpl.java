package com.example.creation_perso_api.service.impl;

import com.example.creation_perso_api.Entity.Race;
import com.example.creation_perso_api.dto.RaceDto;
import com.example.creation_perso_api.mapper.RaceMapper;
import com.example.creation_perso_api.repository.RaceRepository;
import com.example.creation_perso_api.service.RaceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("race")
public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepository;

    public RaceServiceImpl(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }
    @Override
    public List<Race> getAllRace() {
        List<RaceDto> raceDtos = this.raceRepository.findAll();
        List<Race> races = new ArrayList<>();
        for (RaceDto raceDto : raceDtos) {
            races.add(RaceMapper.toEntity(raceDto));
        }
        return races;
    }

    @Override
    public Race getRaceByName(String name) {
        List<RaceDto> raceDtos = this.raceRepository.findAll();
        for (RaceDto raceDto : raceDtos) {
            if (raceDto.getName().equals(name)) {
                return RaceMapper.toEntity(raceDto);
            }
        }
        return null;
    }
}
