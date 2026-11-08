package greeter

import "testing"

func TestGreet(t *testing.T) {
	got := Greet("Gopher")
	want := "Bonjour, Gopher ! Bienvenue sur l'application Go."
	if got != want {
		t.Errorf("Greet(\"Gopher\") = %q; attendu %q", got, want)
	}
}

func TestGreetDefault(t *testing.T) {
	got := Greet("   ")
	want := "Bonjour, Monde ! Bienvenue sur l'application Go."
	if got != want {
		t.Errorf("Greet default = %q; attendu %q", got, want)
	}
}

func TestGreetWithOptionsShout(t *testing.T) {
	opts := Options{Name: "Alice", Shout: true}
	got := GreetWithOptions(opts)
	want := "BONJOUR, ALICE ! BIENVENUE SUR L'APPLICATION GO."
	if got != want {
		t.Errorf("GreetWithOptions shout = %q; attendu %q", got, want)
	}
}
