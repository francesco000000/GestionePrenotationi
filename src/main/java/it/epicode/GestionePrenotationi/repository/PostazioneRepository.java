package it.epicode.GestionePrenotationi.repository;

import it.epicode.GestionePrenotationi.component.Edificio;
import it.epicode.GestionePrenotationi.component.Postazione;
import it.epicode.GestionePrenotationi.component.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione,Integer> {

}
