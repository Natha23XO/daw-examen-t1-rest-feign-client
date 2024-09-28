package pe.edu.cibertec.daw_examen_t1_rest_feign_client.repository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.model.Empleado;

import java.util.List;

@Repository
public interface EmpleadoRepository {
    List<Empleado> obtenerEmpleados();
}
