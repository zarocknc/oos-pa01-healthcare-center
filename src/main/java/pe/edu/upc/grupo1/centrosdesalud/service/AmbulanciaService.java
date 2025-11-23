package pe.edu.upc.grupo1.centrosdesalud.service;

import pe.edu.upc.grupo1.centrosdesalud.entity.Ambulancia;

import java.util.List;
import java.util.Optional;

public interface AmbulanciaService {
    List<Ambulancia> listarTodas();
    Optional<Ambulancia> buscarPorId(Long id);
    Ambulancia guardar(Ambulancia ambulancia);
    void eliminar(Long id);
}
