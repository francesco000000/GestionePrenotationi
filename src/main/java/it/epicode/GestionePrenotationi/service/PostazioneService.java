package it.epicode.GestionePrenotationi.service;

import it.epicode.GestionePrenotationi.component.Postazione;
import it.epicode.GestionePrenotationi.component.TipoPostazione;
import it.epicode.GestionePrenotationi.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    public void salvaPostazione(Postazione postazione){
        postazioneRepository.save(postazione);
    }
    public Postazione cercaPostazione(int id){
        return postazioneRepository.findById(id).get();
    }
    public void eliminaPostazione(int id){
       postazioneRepository.deleteById(id);
    }

}
