package it.epicode.GestionePrenotationi.component;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@Entity
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomeEdificio;
    private String indirizzo;
    private String citta;
    @OneToMany(mappedBy = "edificio",cascade = CascadeType.REMOVE)
    private List<Postazione> postazioni;
}
