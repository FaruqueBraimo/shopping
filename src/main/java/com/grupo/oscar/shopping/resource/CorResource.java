package com.grupo.oscar.shopping.resource;


import com.grupo.oscar.shopping.DTO.request.CategoriaDTO;
import com.grupo.oscar.shopping.DTO.response.CategoriaJson;
import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.model.Cor;
import com.grupo.oscar.shopping.service.CorService;
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
@RequestMapping(path = "/api/v1/cor", name = "cores")
@RequiredArgsConstructor
public class CorResource {

    private  final CorService corService;

    @PostMapping
    @ApiOperation("Criar novo cor")
    public ResponseEntity<Cor> create(@RequestBody @Valid Cor cor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(corService.create(cor));
    }

    @GetMapping
    @ApiOperation("Listar todas cores")
    public ResponseEntity<List<Cor>> getAll() {
        return ResponseEntity.ok(corService.getAllCores());
    }


    @DeleteMapping("/{id}")
    @ResponseBody
    @ApiOperation("Deletar por id")
    public ResponseEntity<?> delete(@RequestParam String id ) {
        corService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

