package pe.edu.cibertec.daw_examen_t1_rest_feign_client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {


}
