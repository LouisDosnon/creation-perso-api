package com.example.creation_perso_api.service.impl;

import com.example.creation_perso_api.Entity.Classe;
import com.example.creation_perso_api.dto.ClasseDto;
import com.example.creation_perso_api.mapper.ClasseMapper;
import com.example.creation_perso_api.repository.ClasseRepository;
import com.example.creation_perso_api.service.ClasseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("classe")
public class ClasseServiceImpl implements ClasseService {

    private ClasseRepository classeRepository;

    public ClasseServiceImpl(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }
    @Override
    public List<Classe> getAllClasse() {
        List<ClasseDto> classeDtos = this.classeRepository.findAll();
        List<Classe> classes = new ArrayList<>();
        for (ClasseDto classeDto : classeDtos) {
            classes.add(ClasseMapper.toEntity(classeDto));
        }
        return classes;
    }

    @Override
    public Classe getClasseByName(String name) {
        List<ClasseDto> classeDtos = this.classeRepository.findAll();
        for (ClasseDto classeDto : classeDtos) {
            if (classeDto.getName().equals(name)) {
                return ClasseMapper.toEntity(classeDto);
            }
        }
        return null;
    }
}
