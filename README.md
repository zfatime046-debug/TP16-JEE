# TP8 - Supervision et Logging Spring Boot

## Structure du projet
```
tp8-monitoring/
├── pom.xml
├── prometheus.yml
├── docker-compose.yml
├── alerts.yml
└── src/main/
    ├── java/ma/ens/tp8monitoring/
    │   ├── Tp8MonitoringApplication.java
    │   ├── controller/DemoController.java
    │   ├── service/DemoService.java
    │   └── config/LoggingConfig.java
    └── resources/
        └── application.properties
```

## Lancer avec IntelliJ

1. **Ouvrir le projet** : File → Open → sélectionner le dossier `tp8-monitoring`
2. **Attendre** que IntelliJ charge Maven (barre de progression en bas)
3. **Lancer** : clic droit sur `Tp8MonitoringApplication.java` → Run

## Endpoints à tester (dans le navigateur)

| URL | Description |
|-----|-------------|
| http://localhost:8080/process | Appel du service métier |
| http://localhost:8080/actuator/health | État de santé |
| http://localhost:8080/actuator/info | Infos de l'app |
| http://localhost:8080/actuator/metrics | Liste des métriques |
| http://localhost:8080/actuator/prometheus | Métriques format Prometheus |

## Voir les logs en direct

```bash
tail -f logs/application.log
```

## Lancer Prometheus (séparé)

```bash
./prometheus --config.file=prometheus.yml
# Accessible sur http://localhost:9090
```

## Lancer Grafana (séparé)

```bash
./bin/grafana-server
# Accessible sur http://localhost:3000 (admin/admin)
# Importer dashboard ID : 4701
```

## Tout lancer avec Docker

```bash
docker build -t spring-monitoring:1.0 .
docker-compose up -d
```
