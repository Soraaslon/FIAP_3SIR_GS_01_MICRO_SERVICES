package br.com.fiap.rm_552407.controle;

import br.com.fiap.rm_552407.dto.DesastreCreateDTO;
import br.com.fiap.rm_552407.dto.DesastreDTO;
import br.com.fiap.rm_552407.service.DesastreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/desastre")
public class DesastreController {

    @Autowired
    private DesastreService service;

    @PostMapping
    public ResponseEntity<DesastreDTO> criar(@RequestBody DesastreCreateDTO dto) {
        return new ResponseEntity<>(service.criar(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public List<DesastreDTO> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public DesastreDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public DesastreDTO atualizar(@PathVariable Long id, @RequestBody DesastreCreateDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
