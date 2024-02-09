package it.epicode.GestionePrenotationi.service;

import it.epicode.GestionePrenotationi.component.Edificio;
import it.epicode.GestionePrenotationi.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    @Autowired
    private EdificioRepository edificioRepository;

    public void salvaEdificio(Edificio edificio){
        edificioRepository.save(edificio);
    }
    public Edificio cercaEdificio(int id){
        return edificioRepository.findById(id).get();
    }
    public void eliminaEdificio(int id){
        edificioRepository.deleteById(id);
    }
}
