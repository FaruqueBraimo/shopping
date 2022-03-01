package com.grupo.oscar.shopping.repository;

import com.grupo.oscar.shopping.model.Calcado;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface CalcadoRepository extends JpaRepository<Calcado, String> {

    @Query(value = "SELECT * FROM calcado c WHERE c.nome = :nome or c.preco = :preco or c.tamanho = :tamanho " +
            " or c.categoria = :categoria and c.cor = :cor or  c.marca = :marca",
            nativeQuery = true)
    List<Calcado> findByMulpleFields(@Param("nome") String nome, @Param("preco") int preco, @Param("tamanho") int tamanho,
                                     @Param("categoria") String categoria, @Param("cor") String cor,
                                     @Param("marca") String marca


    );
}

