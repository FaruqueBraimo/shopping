package com.grupo.oscar.shopping.repository;

import com.grupo.oscar.shopping.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoriaRepository extends JpaRepository<Categoria, String> {
}
