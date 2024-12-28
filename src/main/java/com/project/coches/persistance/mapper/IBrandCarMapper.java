package com.project.coches.persistance.mapper;

import com.project.coches.domain.dto.BrandCarDto;
import com.project.coches.persistance.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IBrandCarMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    BrandCarDto toBranCarDto(BrandCarEntity marcaEntity);

    @InheritInverseConfiguration
    @Mapping(target = "carEntities", ignore = true)
    BrandCarEntity toBranCarEntity(BrandCarDto brandCarDto);

    List<BrandCarDto> toBranCarListDto(List<BrandCarEntity> brandCarEntities);
}
