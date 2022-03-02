package com.grupo.oscar.shopping.service;

import com.grupo.oscar.shopping.DTO.request.CategoriaDTO;
import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.model.Cor;
import com.grupo.oscar.shopping.model.Marca;

import java.util.List;

public interface CorService {
    Cor create(Cor marca);
    List<Cor> getAllCores();
    Cor getMarca(String id);
    Categoria update(Cor cor);
    void delete(String id);
}
