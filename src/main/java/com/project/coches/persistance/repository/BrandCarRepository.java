package com.project.coches.persistance.repository;

import com.project.coches.domain.dto.BrandCarDto;
import com.project.coches.domain.repository.IBrandCarRepository;
import com.project.coches.persistance.crud.IBrandCarCrudRepository;
import com.project.coches.persistance.entity.BrandCarEntity;

import com.project.coches.persistance.mapper.IBrandCarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de marca coche
 */
@RequiredArgsConstructor
@Repository
public class BrandCarRepository implements IBrandCarRepository {

    private final IBrandCarCrudRepository iBrandCarCrudRepository;
    private final IBrandCarMapper iBrandCarMapper;

    @Override
    public List<BrandCarDto> getAll() {
        return iBrandCarMapper.toBranCarListDto(iBrandCarCrudRepository.findAll());
    }

    @Override
    public Optional<BrandCarDto> getBrandCar(Integer id) {
        return iBrandCarCrudRepository.findById(id)
                .map(iBrandCarMapper::toBranCarDto);
    }

    @Override
    public BrandCarDto save(BrandCarDto newBrandCar) {
        BrandCarEntity brandCarEntity = iBrandCarMapper.toBranCarEntity(newBrandCar);
        return iBrandCarMapper.toBranCarDto(iBrandCarCrudRepository.save(brandCarEntity));
    }

    @Override
    public void delete(Integer idBrandCar) {
        iBrandCarCrudRepository.deleteById(idBrandCar);
    }
}
