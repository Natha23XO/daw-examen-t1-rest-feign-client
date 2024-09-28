package pe.edu.cibertec.daw_examen_t1_rest_feign_client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.model.Empleado;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.repository.EmpleadoRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmpleadoService{

    private final EmpleadoRepository empleadoRepository;

    public List<Empleado> findAll() {
        return this.empleadoRepository.findAll();
    }

    public Empleado findById(Long id) {
        return this.empleadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Empleado con id " + id + " no existe."));
    }

    public Empleado create(Empleado empleado) {
        return this.empleadoRepository.save(empleado);
    }

    public Empleado update(Empleado empleado, Long id) {
        Empleado empleadoAux = this.empleadoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empleado con id " + id + " no existe."));
        empleadoAux.setNombre(empleado.getNombre());
        empleadoAux.setApellido(empleado.getApellido());
        empleadoAux.setPuesto(empleado.getPuesto());
        return this.empleadoRepository.save(empleadoAux);
    }

    public String delete(Long id) {
        Empleado cliente = this.findById(id);
        this.empleadoRepository.delete(cliente);
        return "Empleado con id " + id + " eliminado.";
    }
}
