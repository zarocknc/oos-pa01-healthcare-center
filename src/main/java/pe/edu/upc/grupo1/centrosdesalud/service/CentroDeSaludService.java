package pe.edu.upc.grupo1.centrosdesalud.service;

import pe.edu.upc.grupo1.centrosdesalud.entity.Ambulancia;
import pe.edu.upc.grupo1.centrosdesalud.entity.CentroDeSalud;

import java.util.List;
import java.util.Optional;

public interface CentroDeSaludService {
    List<CentroDeSalud> listarTodos();
    Optional<CentroDeSalud> buscarPorId(Long id);
    List<CentroDeSalud> buscarPorTipo(String tipo);
    List<CentroDeSalud> listarCentrosConCalificaciones();
    CentroDeSalud guardar(CentroDeSalud centroDeSalud);
    CentroDeSalud actualizarNombre(Long id, String nuevoNombre);
    List<Ambulancia> obtenerAmbulancias(Long id);
    double obtenerUltimaCalificacion(Long id);
    boolean obtenerEstadoAprobacion(Long id);
    void eliminar(Long id);
}