package pe.edu.upc.grupo1.centrosdesalud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.grupo1.centrosdesalud.entity.Region;

import java.util.List;

public interface RegionController {
    ResponseEntity<List<Region>> listarTodas();
    ResponseEntity<Region> buscarPorId(@PathVariable Long id);
    ResponseEntity<Region> crear(@RequestBody Region region);
    ResponseEntity<Void> eliminar(@PathVariable Long id);
}
