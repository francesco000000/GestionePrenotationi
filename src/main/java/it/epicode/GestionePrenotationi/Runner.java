package it.epicode.GestionePrenotationi;

import it.epicode.GestionePrenotationi.component.Postazione;
import it.epicode.GestionePrenotationi.component.Prenotazione;
import it.epicode.GestionePrenotationi.component.TipoPostazione;
import it.epicode.GestionePrenotationi.component.Utente;
import it.epicode.GestionePrenotationi.service.EdificioService;
import it.epicode.GestionePrenotationi.service.PostazioneService;
import it.epicode.GestionePrenotationi.service.PrenotazioneService;
import it.epicode.GestionePrenotationi.service.UtenteService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Order(1)
public class Runner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(GestionePrenotationiApplication.class);
        Utente utente1 = ctx.getBean(Utente.class);
        utente1.setNome("gino");
        utenteService.salvaUtente(utente1);

        Postazione postazione1= ctx.getBean(Postazione.class);
        postazione1.setStato(false);

        Prenotazione p1 = ctx.getBean(Prenotazione.class);
        p1.setPostazione(postazione1);
       prenotazioneService.salvaPrenotazione(p1);


    }
}
