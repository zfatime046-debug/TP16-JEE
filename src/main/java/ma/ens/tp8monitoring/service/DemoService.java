package ma.ens.tp8monitoring.service;

import io.micrometer.core.instrument.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    public String processData() {
        logger.info("Démarrage du traitement des données");

        // Incrémenter le compteur personnalisé Prometheus
        Metrics.counter("custom.requests.count").increment();
        logger.info("Requête enregistrée dans Prometheus");

        try {
            Thread.sleep(500); // Simulation d'un traitement
        } catch (InterruptedException e) {
            logger.error("Erreur dans le traitement", e);
            Thread.currentThread().interrupt();
        }

        logger.info("Traitement terminé avec succès");
        return "Traitement effectué";
    }
}
