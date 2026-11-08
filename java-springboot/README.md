# Application Web Java / Spring Boot / Maven

Petite application web Spring Boot exposant une page HTML simple, avec tests JUnit 5 et AssertJ.

## Prérequis

- Java JDK 21 (ou supérieur)
- Apache Maven (3.8+)

## Commandes Maven

### 1. Télécharger les dépendances et compiler

```bash
mvn clean compile
```

### 2. Exécuter les tests (JUnit 5 + AssertJ)

```bash
mvn test
```

### 3. Démarrer l'application web

```bash
mvn spring-boot:run
```

L'application sera accessible sur :
- Page d'accueil : [http://localhost:8080/](http://localhost:8080/)
- Page avec paramètre : [http://localhost:8080/?name=Alice](http://localhost:8080/?name=Alice)
- API texte : [http://localhost:8080/api/greet?name=Alice](http://localhost:8080/api/greet?name=Alice)

### 4. Empaqueter l'application (JAR exécutable)

```bash
mvn clean package
java -jar target/demo-1.0.0-SNAPSHOT.jar
```
