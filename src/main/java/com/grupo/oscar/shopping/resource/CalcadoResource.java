package com.grupo.oscar.shopping.resource;

import com.grupo.oscar.shopping.DTO.request.CalcadoDTO;
import com.grupo.oscar.shopping.model.Calcado;
import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.model.Cor;
import com.grupo.oscar.shopping.model.Marca;
import com.grupo.oscar.shopping.service.CalcadoService;
import com.grupo.oscar.shopping.service.CategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.List;

@RestController
@Api(tags = "Shopping Management")
@RequestMapping(path = "/api/v1/calcado", name = "calcados")
@RequiredArgsConstructor
public class CalcadoResource {
    private final CalcadoService calcadoService;
    Logger logger = LoggerFactory.getLogger(CalcadoResource.class);


    @PostMapping
    @ApiOperation("Criar novo calcado")
    public ResponseEntity<Calcado> create(@RequestBody @Valid Calcado calcado) {
        Categoria categoria = calcado.getCategoria();
        Marca marca = calcado.getMarca();
        Cor cor = calcado.getCor();
        return ResponseEntity.status(HttpStatus.CREATED).body(calcadoService.create(cor, marca, categoria, calcado));
    }

    @PutMapping
    @ApiOperation("actualizar calcado")
    public ResponseEntity<Calcado> update(@RequestBody @Valid Calcado calcado) {
        Categoria categoria = calcado.getCategoria();
        Marca marca = calcado.getMarca();
        Cor cor = calcado.getCor();
        return ResponseEntity.status(HttpStatus.CREATED).body(calcadoService.create(cor, marca, categoria, calcado));
    }

    @GetMapping
    @ApiOperation("Listar todos calcados")
    public ResponseEntity<List<Calcado>> getAll() {
        return ResponseEntity.ok(calcadoService.getAllCalcados());
    }


    @GetMapping("/search")
    @ResponseBody
    @ApiOperation("Filtrar por multiplos campos")
    public ResponseEntity<List<Calcado>> getByMultipleFields(@RequestBody CalcadoDTO calcadoDTO) {

        return ResponseEntity.ok(calcadoService.getCalcadoByMultipleFields(calcadoDTO));
    }


    @DeleteMapping("/{id}")
    @ResponseBody
    @ApiOperation("Deletar por id")
    public ResponseEntity<?> delete(@RequestParam String id ) {
        calcadoService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
