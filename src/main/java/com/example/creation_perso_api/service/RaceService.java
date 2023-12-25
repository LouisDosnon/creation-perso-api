package com.example.creation_perso_api.service;

import com.example.creation_perso_api.Entity.Race;

import java.util.List;

public interface RaceService {
    List<Race> getAllRace();
    Race getRaceByName(String classe);
}
