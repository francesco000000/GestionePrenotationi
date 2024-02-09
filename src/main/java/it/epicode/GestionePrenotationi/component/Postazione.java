package it.epicode.GestionePrenotationi.component;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Entity
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private int numeroMassimoOccupanti;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
    private boolean stato ;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @OneToOne(mappedBy = "postazione")
    private Prenotazione prenotazione;


}
