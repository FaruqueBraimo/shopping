package com.grupo.oscar.shopping.DTO.request;

import lombok.Data;

import java.time.LocalDate;


@Data
public class CalcadoDTO {

    private  String nome;
    private int tamanho;
    private int preco;
//    private String createdAt;
    private String descricao;
    private String marca_id;
    private String categoria_id;
    private String cor_id;

}
