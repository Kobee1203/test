<<<<<<< main
# Exemples de Projets Multi-Langages
=======
# Test Repository
>>>>>>> origin/main

Ce repository contient 5 exemples de projets prêts à l'emploi couvrant différents écosystèmes et technologies :

<<<<<<< main
---

## 📁 Vue d'ensemble des projets

| Dossier | Langage / Stack | Type de projet | Tests |
| :--- | :--- | :--- | :--- |
| [`node-typescript/`](./node-typescript/) | Node.js + TypeScript | Application Console | **Vitest** |
| [`go-app/`](./go-app/) | Go (Golang) | Application Console + Module | **`go test`** (testing standard) |
| [`java-springboot/`](./java-springboot/) | Java 21 + Spring Boot 3 + Maven | Application Web (page d'accueil) | **JUnit 5 + AssertJ** |
| [`vue-typescript/`](./vue-typescript/) | Vue 3 + TypeScript + Vite + pnpm | Application Web SPA | **Vitest** + `@vue/test-utils` |
| [`python-app/`](./python-app/) | Python 3 | Application Console + Module | **`unittest`** / `pytest` |

---

## 🚀 Démarrage Rapide

### 1. Node.js & TypeScript (`node-typescript/`)
Application console affichant un message personnalisé dans le terminal avec tests unitaires sous Vitest.
```bash
cd node-typescript
pnpm install          # ou npm install
pnpm start            # Lancer l'application console
pnpm test             # Exécuter les tests Vitest
```

### 2. Go (`go-app/`)
Application console découpée avec un module `greeter` et ses tests unitaires associés.
```bash
cd go-app
go run main.go        # Lancer l'application console
go test -v ./...      # Exécuter les tests unitaires
```

### 3. Java / Spring Boot / Maven (`java-springboot/`)
Application web avec contrôleur servant une page d'accueil HTML et un endpoint API, testée avec JUnit 5 et AssertJ.
```bash
cd java-springboot
mvn clean compile     # Télécharger les dépendances et compiler
mvn test              # Exécuter les tests (JUnit 5 + AssertJ)
mvn spring-boot:run   # Démarrer le serveur web sur http://localhost:8080/
```

### 4. Vue.js / TypeScript / Vite / pnpm (`vue-typescript/`)
Application web Vue 3 réactive utilisant des composants typés, testée avec Vitest (composants et code TypeScript pur).
```bash
cd vue-typescript
pnpm install          # Installer les dépendances
pnpm dev              # Démarrer le serveur de développement (http://localhost:5173)
pnpm test             # Exécuter les tests Vitest (composants et utilitaires TS)
```

### 5. Python (`python-app/`)
Application console avec module de logique métier et calculs statistiques, testée avec `unittest` / `pytest`.
```bash
cd python-app
python3 src/main.py   # Lancer l'application console
python3 -m unittest discover -s tests -p "test_*.py"  # Exécuter les tests
```
=======
This is the first section.

## Title 2
>>>>>>> origin/main
