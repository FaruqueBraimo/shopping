package com.grupo.oscar.shopping;

import com.grupo.oscar.shopping.model.Calcado;
import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.model.Cor;
import com.grupo.oscar.shopping.model.Marca;
import com.grupo.oscar.shopping.repository.CalcadoRepository;
import com.grupo.oscar.shopping.repository.CategoriaRepository;
import com.grupo.oscar.shopping.repository.CorRepository;
import com.grupo.oscar.shopping.repository.MarcaRepository;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase( replace =  AutoConfigureTestDatabase.Replace.NONE)
public class CalcadoTest {

    @Autowired
    private  CategoriaRepository categoriaRepository;

    @Autowired
    private CalcadoRepository calcadoRepository;

    @Autowired
    private MarcaRepository marcaRepository;

    @Autowired
    private CorRepository corRepository;

    @Test
    @Order(1)
    @Rollback(value = true)
    public  void  createCalcado() {

        Categoria categoria = categoriaRepository.getById("4aad2418-245f-4083-b315-5dc2e1f0631c");
        Cor cor = corRepository.getById("b9be5e3f-934a-4216-b96d-07f22d59ea6d");
        Marca marca = marcaRepository.getById("9bb8c91d-67c0-406d-a25b-70ccd015dc2b");

        Calcado calcado = new Calcado();
        calcado.setId(UUID.randomUUID().toString());
        calcado.setNome("Yeezy");
        calcado.setQuantidade_stock(20);
        calcado.setTamanho(41);
        calcado.setPreco(389);
        calcado.setData_criacao(LocalDate.now());
        calcado.setCategoria(categoria);
        calcado.setCor(cor);
        calcado.setMarca(marca);
        Assertions.assertThat((calcadoRepository.save(calcado))).isNull();

    }

    @Test
    @Order(2)
    @Rollback(value = false)
    public  void  getAllCalcados() {
        List<Calcado> calcadoList =  calcadoRepository.findAll();
        Assertions.assertThat(calcadoList.size()).isGreaterThan(0);
    }


    @Test
    @Order(3)
    public void getCalcado(){

        Calcado calcado =  calcadoRepository.findById("a57tu37e-33d6-15c1-8b72-c5cb687733a3").get();
        Assertions.assertThat(calcado.getId()).isEqualTo("a57tu37e-33d6-15c1-8b72-c5cb687733a3");

    }

    @Test
    @Order(4)
    @Rollback(value = false)
    public void deleteCategory(){

        Calcado calcadoToDelete = calcadoRepository.findById("a57tu37e-33d6-15c1-8r72-c5yb687733e3").get();
        calcadoRepository.delete(calcadoToDelete);

        Calcado  calcadoDeleted = null;

        Optional<Calcado> optionalEmployee = calcadoRepository.findById("a57tu37e-33d6-15c1-8r72-c5yb687733e3");

        if(optionalEmployee.isPresent()){
            calcadoDeleted = optionalEmployee.get();
        }

        Assertions.assertThat(calcadoDeleted).isNull();
    }

    @Test
    @Order(4)
    @Rollback(value = false)
    public void updateEmployeeTest(){

        Calcado calcadoToUpdate = calcadoRepository.findById("a57tu37e-33d6-15c1-8b72-c5cb687733a3").get();

        calcadoToUpdate.setNome("Air Jordan 4 x Olivia Kim");

        Calcado calcadoUpdated =  calcadoRepository.save(calcadoToUpdate);

        Assertions.assertThat(calcadoUpdated.getNome()).isEqualTo("Air Jordan 4 x Olivia Kim");

    }

}
