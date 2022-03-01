package com.grupo.oscar.shopping.DTO.response;

import com.grupo.oscar.shopping.model.Categoria;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CalcadoJson {

    private String id;
    private  String nome;
    private int tamanho;
    private int preco;
    private String quantidade_stock;
    private String descricao;
}
