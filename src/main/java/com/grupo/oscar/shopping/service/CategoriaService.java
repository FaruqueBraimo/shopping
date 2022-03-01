package com.grupo.oscar.shopping.service;

import com.grupo.oscar.shopping.DTO.request.CalcadoDTO;
import com.grupo.oscar.shopping.DTO.request.CategoriaDTO;
import com.grupo.oscar.shopping.DTO.response.CategoriaJson;
import com.grupo.oscar.shopping.model.Categoria;

import java.util.List;
import java.util.UUID;


public interface CategoriaService {
    CategoriaJson create(CategoriaDTO categoriaDTO);
    List<Categoria> getAllCategories();
    Categoria getCategoria(String id);
}
