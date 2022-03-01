package com.grupo.oscar.shopping.repository;

import com.grupo.oscar.shopping.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MarcaRepository extends JpaRepository<Marca, String> {
}
