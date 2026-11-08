#!/usr/bin/env python3
"""Point d'entrée console de l'application Python."""

import os
import sys

# Permet l'import direct de modules locaux quel que soit le dossier d'appel
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from greeter import format_greeting, calculate_summary


def main() -> None:
    message = format_greeting(name="Développeur")
    stats = calculate_summary([14.5, 18.0, 12.0, 19.5])

    print("=" * 55)
    print(message)
    print("-" * 55)
    print(f"Statistiques d'exemple : {stats}")
    print("=" * 55)


if __name__ == "__main__":
    main()

