# TP16 - Supervision et Logging Spring Boot

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

## Screenshots des endpoints

### 1. /process
<img width="1148" height="191" alt="process" src="https://github.com/user-attachments/assets/9e84dbab-c95b-4b4f-bc76-e71daba9ccbc" />

### 2. /actuator/health
<img width="1600" height="155" alt="health" src="https://github.com/user-attachments/assets/45a1051f-3602-4255-a176-c405f5e8ce3b" />

### 3. /actuator/info
<img width="1353" height="310" alt="info" src="https://github.com/user-attachments/assets/df239b9f-db40-43b9-98b9-37e3d8f1b616" />

### 4. /actuator/beans
<img width="1600" height="789" alt="beans" src="https://github.com/user-attachments/assets/6ad7e9aa-22d5-4d6f-b0bf-6242ef8815b5" />

### 5. /actuator/env
<img width="1600" height="789" alt="env" src="https://github.com/user-attachments/assets/b3854205-78b3-4fdd-9745-9693cc171cd5" />

### 6. /actuator/metrics
<img width="1600" height="361" alt="metrics" src="https://github.com/user-attachments/assets/0439bad5-3c73-492c-8ef1-fde59f723b92" />

### 7. /actuator/prometheus
<img width="1413" height="932" alt="prometheus" src="https://github.com/user-attachments/assets/c1e0975f-d88d-447b-a9db-27c263626c99" />

## Logs en direct

<img width="1784" height="716" alt="logs" src="https://github.com/user-attachments/assets/6018f1dc-8f04-42f8-8fd7-ec857577daba" />

## Prometheus — http://localhost:9090

<img width="1568" height="768" alt="prometheus-1" src="https://github.com/user-attachments/assets/63769f63-08df-4bc9-ad57-9206b9d0ea96" />
<img width="1600" height="784" alt="prometheus-2" src="https://github.com/user-attachments/assets/032d5811-04a2-4939-a933-3f174176cefe" />

## Grafana — http://localhost:3000

<img width="1600" height="700" alt="grafana-1" src="https://github.com/user-attachments/assets/e598587a-fae0-4200-a3d3-7eaa790ef49f" />
<img width="1788" height="472" alt="grafana-2" src="https://github.com/user-attachments/assets/1def04b8-8666-4f9e-a438-c3fc52a3d9b9" />

## Tout lancer avec Docker
```bash
docker build -t spring-monitoring:1.0 .
docker-compose up -d
```

<img width="1817" height="509" alt="docker" src="https://github.com/user-attachments/assets/da71bf93-b6d5-47a4-bebd-d49a17df8247" />
