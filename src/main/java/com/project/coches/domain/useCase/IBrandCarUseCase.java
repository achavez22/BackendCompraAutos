package com.project.coches.domain.useCase;

import com.project.coches.domain.dto.BrandCarDto;

import java.util.List;
import java.util.Optional;

public interface IBrandCarUseCase {

    List<BrandCarDto> getAll();
    Optional<BrandCarDto> getBrandCar(Integer id);
    BrandCarDto save(BrandCarDto newBrandCar);

    Optional<BrandCarDto> update(BrandCarDto newBrandCar);
    boolean delete(Integer idBrandCar);
}
