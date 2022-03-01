package com.grupo.oscar.shopping.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Data
public class Categoria {
    @Id
    private String id; // gerado automaticamente via UUID.
    private String nome;
    @OneToMany(mappedBy = "categoria",fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Calcado> calcados;
}
