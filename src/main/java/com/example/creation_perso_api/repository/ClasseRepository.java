package com.example.creation_perso_api.repository;

import com.example.creation_perso_api.dto.ClasseDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepository extends MongoRepository<ClasseDto, String>{
}
