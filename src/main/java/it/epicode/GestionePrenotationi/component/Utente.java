package it.epicode.GestionePrenotationi.component;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Data
@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String cognome;
    private String email;
    @OneToMany(mappedBy = "utente", cascade = CascadeType.REMOVE)
    private List<Prenotazione> prenotazioni;
    @OneToMany(mappedBy = "utente",cascade = CascadeType.REMOVE)
    private List<Postazione> postazioni;
}
