package pe.edu.upc.grupo1.centrosdesalud.service;

import pe.edu.upc.grupo1.centrosdesalud.entity.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {
    List<Region> listarTodas();
    Optional<Region> buscarPorId(Long id);
    Region guardar(Region region);
    void eliminar(Long id);
}
