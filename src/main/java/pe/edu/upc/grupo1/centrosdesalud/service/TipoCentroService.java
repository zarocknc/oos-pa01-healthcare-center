package pe.edu.upc.grupo1.centrosdesalud.service;

import pe.edu.upc.grupo1.centrosdesalud.entity.TipoCentro;

import java.util.List;
import java.util.Optional;

public interface TipoCentroService {
    List<TipoCentro> listarTodos();
    Optional<TipoCentro> buscarPorId(Long id);
    TipoCentro guardar(TipoCentro tipoCentro);
    void eliminar(Long id);
}
