package it.epicode.GestionePrenotationi.service;

import it.epicode.GestionePrenotationi.component.Postazione;
import it.epicode.GestionePrenotationi.component.Prenotazione;
import it.epicode.GestionePrenotationi.component.TipoPostazione;
import it.epicode.GestionePrenotationi.component.Utente;
import it.epicode.GestionePrenotationi.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public void salvaUtente(Utente utente){
        utenteRepository.save(utente);
    }
    public Utente cercaUtente(int id){
        return utenteRepository.findById(id).get();
    }
    public void eliminaUtente(int id){
        utenteRepository.deleteById(id);
    }

    public List<Postazione> trovaPostazioniPerTipoECittaPerUtente(TipoPostazione tipoPostazione, String citta) {
        return utenteRepository.trovaPostazioniPerTipoECittaPerUtente(tipoPostazione, citta);
}

}
