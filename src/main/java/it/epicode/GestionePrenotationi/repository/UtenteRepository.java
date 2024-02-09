package it.epicode.GestionePrenotationi.repository;

import it.epicode.GestionePrenotationi.component.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UtenteRepository extends JpaRepository<Utente,Integer> {
    @Query("SELECT p FROM Utente u JOIN u.postazioni p WHERE p.tipoPostazione = :tipoPostazione AND p.edificio.citta = :citta")
    List<Postazione> trovaPostazioniPerTipoECittaPerUtente(TipoPostazione tipoPostazione, String citta);


}
