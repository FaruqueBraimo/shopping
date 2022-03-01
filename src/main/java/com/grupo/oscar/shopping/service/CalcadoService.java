package com.grupo.oscar.shopping.service;


import com.grupo.oscar.shopping.DTO.request.CalcadoDTO;
import com.grupo.oscar.shopping.DTO.response.CalcadoJson;
import com.grupo.oscar.shopping.model.Calcado;
import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.model.Cor;
import com.grupo.oscar.shopping.model.Marca;

import java.util.List;

public interface CalcadoService {
    Calcado create(Cor cor, Marca marca, Categoria categoria, Calcado calcado);
    List<Calcado> getAllCalcados();
    Calcado update(Calcado calcadoDTO);
    void delete(String id);
    Calcado getCalcado(String id);
   List<Calcado> getCalcadoByMultipleFields(CalcadoDTO calcadoDTO);

}
