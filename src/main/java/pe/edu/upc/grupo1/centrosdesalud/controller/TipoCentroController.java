package pe.edu.upc.grupo1.centrosdesalud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.grupo1.centrosdesalud.entity.TipoCentro;

import java.util.List;

public interface TipoCentroController {
    ResponseEntity<List<TipoCentro>> listarTodos();
    ResponseEntity<TipoCentro> buscarPorId(@PathVariable Long id);
    ResponseEntity<TipoCentro> crear(@RequestBody TipoCentro tipoCentro);
    ResponseEntity<Void> eliminar(@PathVariable Long id);
}
