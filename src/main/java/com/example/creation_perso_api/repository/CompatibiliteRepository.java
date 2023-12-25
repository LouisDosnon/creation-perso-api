package com.example.creation_perso_api.repository;

import com.example.creation_perso_api.dto.CompatibiliteDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompatibiliteRepository extends MongoRepository<CompatibiliteDto, String>{
}
