package com.grupo.oscar.shopping.service;

import com.grupo.oscar.shopping.DTO.mapper.CategoriaMapper;
import com.grupo.oscar.shopping.DTO.request.CategoriaDTO;
import com.grupo.oscar.shopping.DTO.response.CategoriaJson;
import com.grupo.oscar.shopping.model.Calcado;
import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoriaImpl implements  CategoriaService{

    private  final CategoriaRepository categoriaRepository;
    private final CategoriaMapper MAPPER = CategoriaMapper.INSTANCE;

    @Override
    public CategoriaJson create(CategoriaDTO categoriaDTO) {
        Categoria categoria = MAPPER.mapToModel(categoriaDTO);
        categoria.setId(UUID.randomUUID().toString());
        return MAPPER.mapToJson(categoriaRepository.save(categoria));
    }

    @Override
    public List<Categoria> getAllCategories() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria getCategoria(String id) {
        return categoriaRepository.getById(id);
    }

    @Override
    public Categoria update(CategoriaDTO categoriaDTO) {
        return null;
    }

    @Override
    public void delete(String id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        if (categoria.isPresent()) {
            categoriaRepository.delete(categoria.get());
        }
    }
}
