package pe.edu.upc.grupo1.centrosdesalud.service;

import pe.edu.upc.grupo1.centrosdesalud.entity.Calificacion;
import pe.edu.upc.grupo1.centrosdesalud.entity.CentroDeSalud;

import java.util.List;
import java.util.Optional;

public interface CalificacionService {
    List<Calificacion> listarTodas();
    Optional<Calificacion> buscarPorId(Long id);
    List<Calificacion> listarPorCentro(CentroDeSalud centro);
    Calificacion obtenerUltimaPorCentro(CentroDeSalud centro);
    Calificacion guardar(Calificacion calificacion);
    void eliminar(Long id);
}
