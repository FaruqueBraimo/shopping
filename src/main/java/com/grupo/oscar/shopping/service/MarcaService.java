package com.grupo.oscar.shopping.service;


import com.grupo.oscar.shopping.model.Marca;


import java.util.List;

public interface MarcaService {
    Marca create(Marca marca);
    List<Marca> getAllMarcas();
    Marca getMarca(String id);
}
