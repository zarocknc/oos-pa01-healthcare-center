package pe.edu.upc.grupo1.centrosdesalud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.grupo1.centrosdesalud.entity.Ambulancia;

import java.util.List;

public interface AmbulanciaController {
    ResponseEntity<List<Ambulancia>> listarTodas();
    ResponseEntity<Ambulancia> buscarPorId(@PathVariable Long id);
    ResponseEntity<Ambulancia> crear(@RequestBody Ambulancia ambulancia);
    ResponseEntity<Void> eliminar(@PathVariable Long id);
}
