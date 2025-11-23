package pe.edu.upc.grupo1.centrosdesalud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.grupo1.centrosdesalud.entity.Calificacion;

import java.util.List;

public interface CalificacionController {
    ResponseEntity<List<Calificacion>> listarTodas();
    ResponseEntity<Calificacion> buscarPorId(@PathVariable Long id);
    ResponseEntity<List<Calificacion>> listarPorCentro(@PathVariable Long centroId);
    ResponseEntity<Calificacion> crear(@RequestBody Calificacion calificacion);
    ResponseEntity<Void> eliminar(@PathVariable Long id);
}
