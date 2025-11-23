package pe.edu.upc.grupo1.centrosdesalud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ambulancias")
public class Ambulancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20, unique = true)
    private String placa;

    @Column(nullable = false, length = 100)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "centro_id", nullable = false)
    private CentroDeSalud centro;

    public Ambulancia() {
    }

    public Ambulancia(String placa, String modelo, CentroDeSalud centro) {
        this.placa = placa;
        this.modelo = modelo;
        this.centro = centro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CentroDeSalud getCentro() {
        return centro;
    }

    public void setCentro(CentroDeSalud centro) {
        this.centro = centro;
    }
}