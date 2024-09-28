package pe.edu.cibertec.daw_examen_t1_rest_feign_client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.model.Cliente;
import pe.edu.cibertec.daw_examen_t1_rest_feign_client.repository.ClienteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;


    public List<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }


    public Cliente findById(Long id) {
        return this.clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente con id " + id + " no existe."));
    }


    public Cliente create(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }


    public Cliente update(Cliente cliente, Long id) {
        Cliente clienteAux = this.clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente con id " + id + " no existe."));
        clienteAux.setNombre(cliente.getNombre());
        clienteAux.setApellido(cliente.getApellido());
        clienteAux.setEmail(cliente.getEmail());
        clienteAux.setTelefono(cliente.getTelefono());
        clienteAux.setDireccion(cliente.getDireccion());
        return this.clienteRepository.save(clienteAux);
    }


    public String delete(Long id) {
        Cliente cliente = this.findById(id);
        this.clienteRepository.delete(cliente);
        return "Cliente con id " + id + " eliminado.";
    }

}
