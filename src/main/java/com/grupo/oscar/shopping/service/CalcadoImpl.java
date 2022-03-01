package com.grupo.oscar.shopping.service;

import com.grupo.oscar.shopping.DTO.mapper.CalcadoMapper;
import com.grupo.oscar.shopping.DTO.mapper.CategoriaMapper;
import com.grupo.oscar.shopping.DTO.request.CalcadoDTO;
import com.grupo.oscar.shopping.DTO.response.CalcadoJson;
import com.grupo.oscar.shopping.model.Calcado;
import com.grupo.oscar.shopping.model.Categoria;
import com.grupo.oscar.shopping.model.Cor;
import com.grupo.oscar.shopping.model.Marca;
import com.grupo.oscar.shopping.repository.CalcadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CalcadoImpl implements CalcadoService {

    private final CalcadoMapper MAPPER = CalcadoMapper.INSTANCE;
    private final CalcadoRepository calcadoRepository;

    @Override
    public Calcado create(Cor cor, Marca marca, Categoria categoria, Calcado calcado) {
        calcado.setCategoria(categoria);
        calcado.setId(UUID.randomUUID().toString());
        calcado.setMarca(marca);
        calcado.setCor(cor);
        calcado.setData_criacao(LocalDate.now());
        return calcadoRepository.save(calcado);
    }

    @Override
    public List<Calcado> getAllCalcados() {
        return calcadoRepository.findAll();
    }


    @Override
    public Calcado update(Calcado calcado) {
        Optional<Calcado> calcadoToUpdate = calcadoRepository.findById(calcado.getId());
            if (calcadoToUpdate.isPresent()) {
                return  calcadoRepository.save(calcado);
        }

        return  new Calcado() ;
    }



    @Override
    public void delete(String id) {
        Optional<Calcado> calcado = calcadoRepository.findById(id);
        if (calcado.isPresent()) {
            calcadoRepository.delete(calcado.get());
        }
    }

    @Override
    public Calcado getCalcado(String id) {
        return calcadoRepository.getById(id);
    }

    @Override
    public List<Calcado> getCalcadoByMultipleFields(CalcadoDTO calcadoDTO) {
        return calcadoRepository.findByMulpleFields(calcadoDTO.getNome(), calcadoDTO.getPreco(), calcadoDTO.getTamanho(), calcadoDTO.getCategoria_id(),
                calcadoDTO.getCor_id(), calcadoDTO.getMarca_id());
    }


}
