package com.grupo.oscar.shopping.service;

import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.model.Cor;
import com.grupo.oscar.shopping.repository.CorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CorImpl  implements  CorService{
    private  final CorRepository corRepository;

    @Override
    public Cor create(Cor cor) {
        cor.setId(UUID.randomUUID().toString());
        return  corRepository.save(cor);
    }

    @Override
    public List<Cor> getAllCores() {
        return corRepository.findAll();
    }

    @Override
    public Cor getMarca(String id) {
        return corRepository.getById(id);
    }

    @Override
    public Categoria update(Cor cor) {
        return null;
    }

    @Override
    public void delete(String id) {
        Optional<Cor> cor = corRepository.findById(id);
        if (cor.isPresent()) {
            corRepository.delete(cor.get());
        }
    }
}
