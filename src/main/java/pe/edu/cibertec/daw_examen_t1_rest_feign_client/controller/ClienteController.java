package pe.edu.cibertec.daw_examen_t1_rest_feign_client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.model.Cliente;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.service.ClienteService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping("/findAll")
    private ResponseEntity<List<Cliente>> findAll() {
        return new ResponseEntity<>(this.clienteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    private ResponseEntity<Cliente> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.clienteService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    private ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(this.clienteService.create(cliente), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    private ResponseEntity<Cliente> update(@RequestBody Cliente cliente, @PathVariable Long id) {
        return new ResponseEntity<>(this.clienteService.update(cliente, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable Long id) {
        return new ResponseEntity<>(this.clienteService.delete(id), HttpStatus.OK);
    }

}
