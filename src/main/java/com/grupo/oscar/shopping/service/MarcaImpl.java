package com.grupo.oscar.shopping.service;

import com.grupo.oscar.shopping.model.Marca;
import com.grupo.oscar.shopping.repository.MarcaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MarcaImpl  implements  MarcaService{
    private  final MarcaRepository marcaRepository;

    @Override
    public Marca create(Marca marca) {
        marca.setId(UUID.randomUUID().toString());
        return marcaRepository.save(marca);
    }

    @Override
    public List<Marca> getAllMarcas() {
        return marcaRepository.findAll();
    }

    @Override
    public Marca getMarca(String id) {
        return  marcaRepository.getById(id);
    }
}
