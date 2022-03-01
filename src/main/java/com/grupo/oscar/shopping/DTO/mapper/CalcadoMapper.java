package com.grupo.oscar.shopping.DTO.mapper;
import com.grupo.oscar.shopping.DTO.request.CalcadoDTO;
import com.grupo.oscar.shopping.DTO.response.CalcadoJson;
import com.grupo.oscar.shopping.model.Calcado;
import com.grupo.oscar.shopping.model.Categoria;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface CalcadoMapper {
    public static CalcadoMapper INSTANCE = Mappers.getMapper(CalcadoMapper.class);

    @Named("commandToModel")
    public abstract Calcado mapToModel(CalcadoDTO calcadoDTO);
    public abstract void updateModel(@MappingTarget Calcado calcado, CalcadoDTO calcadoDTO);

    @InheritInverseConfiguration
    public abstract CalcadoJson mapToJson(Calcado calcado);
    public abstract List<CalcadoJson> mapToJson(List<Calcado> calcados);
}
