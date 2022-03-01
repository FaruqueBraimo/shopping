package com.grupo.oscar.shopping.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calcado {

    @Id
    private String id;
    private String nome;
    private int tamanho;
    private int preco;
    private int quantidade_stock;
    private LocalDate data_criacao;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "cor")
    private Cor cor;

    @ManyToOne
    @JoinColumn(name = "marca")
    private Marca marca;

}
