package pe.edu.upc.grupo1.centrosdesalud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.grupo1.centrosdesalud.entity.Ambulancia;
import pe.edu.upc.grupo1.centrosdesalud.entity.CentroDeSalud;

import java.util.List;
import java.util.Map;

public interface CentroDeSaludController {
    ResponseEntity<List<CentroDeSalud>> listarTodos();
    ResponseEntity<List<CentroDeSalud>> listarConCalificaciones();
    ResponseEntity<List<CentroDeSalud>> listarPorTipo(@PathVariable String tipo);
    ResponseEntity<CentroDeSalud> buscarPorId(@PathVariable Long id);
    ResponseEntity<Map<String, Boolean>> obtenerEstado(@PathVariable Long id);
    ResponseEntity<List<Ambulancia>> obtenerAmbulancias(@PathVariable Long id);
    ResponseEntity<Map<String, Double>> obtenerUltimaCalificacion(@PathVariable Long id);
    ResponseEntity<CentroDeSalud> crear(@RequestBody CentroDeSalud centroDeSalud);
    ResponseEntity<CentroDeSalud> actualizarNombre(@PathVariable Long id, @RequestBody Map<String, String> body);
    ResponseEntity<Void> eliminar(@PathVariable Long id);
}
