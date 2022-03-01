package com.grupo.oscar.shopping.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cor {
    @Id
    private String id ; // gerado automaticamente via UUID.
    private String nome;
    @OneToMany(mappedBy = "cor",fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Calcado> calcados;

}
