package it.epicode.GestionePrenotationi.repository;

import it.epicode.GestionePrenotationi.component.Edificio;
import it.epicode.GestionePrenotationi.component.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Integer> {
}
