package pe.edu.cibertec.daw_examen_t1_rest_feign_client.model;

import lombok.Data;

@Data
public class Empleado {
    public int id;
    public String nombre;
    public String apellido;
    public String puesto;
}
