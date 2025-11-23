package pe.edu.upc.grupo1.centrosdesalud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos_centro")
public class TipoCentro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    public TipoCentro() {
    }

    public TipoCentro(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}