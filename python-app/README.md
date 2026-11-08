# Application Console Python

Petite application console en Python avec des modules réutilisables et des tests unitaires exécutables nativement avec `unittest` ou via `pytest`.

## Prérequis

- Python 3.9 ou supérieur

## Exécution de l'application console

Depuis le dossier `python-app` :

```bash
cd python-app
python3 src/main.py
```

## Exécution des tests

### Avec le module standard `unittest` (sans aucune dépendance à installer) :

```bash
python3 -m unittest discover -s tests -p "test_*.py"
```

### Avec `pytest` (si installé) :

```bash
pip install -r requirements.txt
pytest
```
