package com.example.creation_perso_api.service.impl;

import com.example.creation_perso_api.Entity.Compatibilite;
import com.example.creation_perso_api.dto.CompatibiliteDto;
import com.example.creation_perso_api.mapper.CompatibiliteMapper;
import com.example.creation_perso_api.repository.CompatibiliteRepository;
import com.example.creation_perso_api.service.CompatibiliteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("compatibilite")
public class CompatibiliteServiceImpl implements CompatibiliteService {

    private CompatibiliteRepository compatibiliteRepository;

    public CompatibiliteServiceImpl(CompatibiliteRepository compatibiliteRepository) {
        this.compatibiliteRepository = compatibiliteRepository;
    }
    @Override
    public List<Compatibilite> getAllCompatibilities() {
        List<CompatibiliteDto> compatibilityDtos = this.compatibiliteRepository.findAll();
        List<Compatibilite> compatibilitys = new ArrayList<>();
        for (CompatibiliteDto compatibilityDto : compatibilityDtos) {
            compatibilitys.add(CompatibiliteMapper.toEntity(compatibilityDto));
        }
        return compatibilitys;
    }

    @Override
    public List<Compatibilite> getCompatibilitiesForClasse(String classe) {
        List<CompatibiliteDto> compatibilityDtos = this.compatibiliteRepository.findAll();
        List<Compatibilite> compatibilitys = new ArrayList<>();
        for (CompatibiliteDto compatibilityDto : compatibilityDtos) {
            if (compatibilityDto.getClasse().equals(classe)) {
                compatibilitys.add(CompatibiliteMapper.toEntity(compatibilityDto));
            }
        }
        return compatibilitys;
    }

    @Override
    public List<Compatibilite> getCompatibilitiesForRace(String race) {
        List<CompatibiliteDto> compatibilityDtos = this.compatibiliteRepository.findAll();
        List<Compatibilite> compatibilitys = new ArrayList<>();
        for (CompatibiliteDto compatibilityDto : compatibilityDtos) {
            if (compatibilityDto.getRace().equals(race)) {
                compatibilitys.add(CompatibiliteMapper.toEntity(compatibilityDto));
            }
        }
        return compatibilitys;
    }
}
