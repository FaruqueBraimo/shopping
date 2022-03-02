package com.grupo.oscar.shopping;

import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.repository.CategoriaRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.UUID;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase( replace =  AutoConfigureTestDatabase.Replace.NONE)
public class Categoriatest {

    @Autowired
    private  CategoriaRepository categoriaRepository;

    @Test
    @Order(1)
    @Rollback(value = true)
    public  void  createCategoria() {
        Categoria categoria = new  Categoria();
        categoria.setId(UUID.randomUUID().toString());
        categoria.setNome("Santalias");
        Categoria categoriaJson =  categoriaRepository.save(categoria);
        Assertions.assertThat(categoriaJson.getNome()).isEqualTo("Santalias");

    }
    @Test
    @Order(2)
    @Rollback(value = false)
    public  void  getAllCategories() {
        List<Categoria> categoriaList =  categoriaRepository.findAll();
        Assertions.assertThat(categoriaList.size()).isGreaterThan(0);
    }



}
