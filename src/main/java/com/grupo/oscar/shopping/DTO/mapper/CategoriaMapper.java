package com.grupo.oscar.shopping.DTO.mapper;


import com.grupo.oscar.shopping.DTO.request.CategoriaDTO;
import com.grupo.oscar.shopping.DTO.response.CategoriaJson;
import com.grupo.oscar.shopping.model.Categoria;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface CategoriaMapper {

    public static CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    @Named("commandToModel")
    public abstract Categoria mapToModel(CategoriaDTO command);
    public abstract void updateModel(@MappingTarget Categoria categoria, CategoriaDTO command);

    @InheritInverseConfiguration
    public abstract CategoriaJson mapToJson(Categoria categoria);
    public abstract List<CategoriaJson> mapToJson(List<Categoria> categorias);

}
