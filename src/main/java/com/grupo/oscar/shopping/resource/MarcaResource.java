package com.grupo.oscar.shopping.resource;


import com.grupo.oscar.shopping.model.Cor;
import com.grupo.oscar.shopping.model.Marca;
import com.grupo.oscar.shopping.service.CorService;
import com.grupo.oscar.shopping.service.MarcaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "Shopping Management")
@RequestMapping(path = "/api/v1/marca", name = "marcas")
@RequiredArgsConstructor
public class MarcaResource {

    private  final MarcaService marcaResource;

    @PostMapping
    @ApiOperation("Criar nova mar")
    public ResponseEntity<Marca> create(@RequestBody @Valid Marca marca) {
        return ResponseEntity.status(HttpStatus.CREATED).body(marcaResource.create(marca));
    }

    @GetMapping
    @ApiOperation("Listar todas marcas")
    public ResponseEntity<List<Marca>> getAll() {
        return ResponseEntity.ok(marcaResource.getAllMarcas());
    }
}
