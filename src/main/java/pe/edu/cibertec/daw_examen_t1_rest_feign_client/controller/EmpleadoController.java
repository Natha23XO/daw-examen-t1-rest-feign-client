package pe.edu.cibertec.daw_examen_t1_rest_feign_client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.model.Empleado;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.service.EmpleadoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    @GetMapping("/findAll")
    private ResponseEntity<List<Empleado>> findAll() {
        return new ResponseEntity<>(this.empleadoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    private ResponseEntity<Empleado> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.empleadoService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    private ResponseEntity<Empleado> create(@RequestBody Empleado empleado) {
        return new ResponseEntity<>(this.empleadoService.create(empleado), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    private ResponseEntity<Empleado> update(@RequestBody Empleado empleado, @PathVariable Long id) {
        return new ResponseEntity<>(this.empleadoService.update(empleado, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable Long id) {
        return new ResponseEntity<>(this.empleadoService.delete(id), HttpStatus.OK);
    }

}
