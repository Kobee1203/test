import unittest
from src.greeter import format_greeting, calculate_summary


class TestGreeter(unittest.TestCase):
    def test_format_greeting_with_name(self):
        result = format_greeting("Alice")
        self.assertEqual(result, "Bonjour, Alice ! Bienvenue sur l'application Python.")

    def test_format_greeting_default_when_empty(self):
        result = format_greeting("   ")
        self.assertEqual(result, "Bonjour, Monde ! Bienvenue sur l'application Python.")

    def test_format_greeting_shout(self):
        result = format_greeting("Bob", shout=True)
        self.assertEqual(
            result, "BONJOUR, BOB ! BIENVENUE SUR L'APPLICATION PYTHON."
        )

    def test_calculate_summary_with_numbers(self):
        stats = calculate_summary([10.0, 20.0, 30.0])
        self.assertEqual(stats["count"], 3)
        self.assertEqual(stats["average"], 20.0)
        self.assertEqual(stats["max"], 30.0)

    def test_calculate_summary_empty(self):
        stats = calculate_summary([])
        self.assertEqual(stats, {"count": 0, "average": 0.0, "max": 0.0})


if __name__ == "__main__":
    unittest.main()
