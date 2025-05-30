package br.com.fiap.rm_552407.service;


import br.com.fiap.rm_552407.dto.DesastreCreateDTO;
import br.com.fiap.rm_552407.dto.DesastreDTO;
import br.com.fiap.rm_552407.model.Desastre;
import br.com.fiap.rm_552407.repository.DesastreRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DesastreService {

    @Autowired
    private DesastreRepository repository;

    public List<DesastreDTO> listarTodos() {
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public DesastreDTO buscarPorId(Long id) {
        Desastre desastre = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return toDTO(desastre);
    }

    public DesastreDTO criar(DesastreCreateDTO dto) {
        Desastre desastre = new Desastre();
        desastre.setNome(dto.getNome());
        desastre.setDescricao(dto.getDescricao());
        desastre.setDataDesastre(dto.getDataDesastre());
        desastre.setLocalizacao(dto.getLocalizacao());

        repository.save(desastre);
        return toDTO(desastre);
    }

    public DesastreDTO atualizar(Long id, DesastreCreateDTO dto) {
        Desastre desastre = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        desastre.setNome(dto.getNome());
        desastre.setDescricao(dto.getDescricao());
        desastre.setDataDesastre(dto.getDataDesastre());
        desastre.setLocalizacao(dto.getLocalizacao());
        
        repository.save(desastre);
        return toDTO(desastre);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        repository.deleteById(id);
    }

    private DesastreDTO toDTO(Desastre Desastre) {
        DesastreDTO dto = new DesastreDTO();
        BeanUtils.copyProperties(Desastre, dto);
        return dto;
    }
}


