package it.epicode.GestionePrenotationi.service;

import it.epicode.GestionePrenotationi.component.Prenotazione;
import it.epicode.GestionePrenotationi.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public void salvaPrenotazione(Prenotazione prenotazione){
        prenotazioneRepository.save(prenotazione);
    }
    public Prenotazione cercaPrenotazione(int id){
        return prenotazioneRepository.findById(id).get();
    }
    public void eliminaPrenotazione(int id){
        prenotazioneRepository.deleteById(id);
    }
}
