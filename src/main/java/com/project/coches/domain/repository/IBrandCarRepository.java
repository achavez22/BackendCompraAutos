package com.project.coches.domain.repository;

import com.project.coches.domain.dto.BrandCarDto;

import java.util.List;
import java.util.Optional;

public interface IBrandCarRepository {

    List<BrandCarDto> getAll();
    Optional<BrandCarDto> getBrandCar(Integer id);
    BrandCarDto save(BrandCarDto newBrandCar);
    void delete(Integer idBrandCar);
}
