package com.grupo.oscar.shopping.resource;


import com.grupo.oscar.shopping.DTO.request.CategoriaDTO;
import com.grupo.oscar.shopping.DTO.response.CategoriaJson;
import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.service.CategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "Shopping Management")
@RequestMapping(path = "/api/v1/categoria", name = "categorias")
@RequiredArgsConstructor
public class CategoriaResource {

    private final CategoriaService categoriaService;

    @PostMapping
    @ApiOperation("Criar nova categoria")
    public ResponseEntity<CategoriaJson> create(@RequestBody @Valid CategoriaDTO categoriaDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.create(categoriaDTO));
    }

    @GetMapping
    @ApiOperation("Listar todas categorias")
    public ResponseEntity<List<Categoria>> getAll() {
        return ResponseEntity.ok(categoriaService.getAllCategories());
    }

}

