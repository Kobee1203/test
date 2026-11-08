"""Module fournissant la logique de salutation et des utilitaires de calcul."""

from typing import List, Dict, Any


def format_greeting(name: str = "Monde", shout: bool = False) -> str:
    """Formate un message d'accueil pour la console."""
    clean_name = name.strip() if name else ""
    if not clean_name:
        clean_name = "Monde"

    message = f"Bonjour, {clean_name} ! Bienvenue sur l'application Python."
    return message.upper() if shout else message


def calculate_summary(scores: List[float]) -> Dict[str, Any]:
    """Calcule le nombre d'éléments, la moyenne et le maximum d'une liste de nombres."""
    if not scores:
        return {"count": 0, "average": 0.0, "max": 0.0}

    return {
        "count": len(scores),
        "average": round(sum(scores) / len(scores), 2),
        "max": max(scores),
    }
