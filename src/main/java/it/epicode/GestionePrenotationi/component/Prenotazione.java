package it.epicode.GestionePrenotationi.component;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
@Data
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @OneToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;
    private LocalDate giornoPrenotato;
    private LocalDate scadenzaPrenotazione;

    public void setPostazione(Postazione postazione)throws Exception {
        if (postazione.isStato() && postazione.getPrenotazione()==null){
            this.postazione=postazione;
        }else
            throw new Exception("Postazione occupata");
    }



}


