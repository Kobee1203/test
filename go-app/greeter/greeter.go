package greeter

import (
	"fmt"
	"strings"
)

// Options définit les paramètres de personnalisation du message.
type Options struct {
	Name  string
	Shout bool
}

// Greet génère un message de salutation pour un nom donné.
func Greet(name string) string {
	return GreetWithOptions(Options{Name: name, Shout: false})
}

// GreetWithOptions génère un message en prenant en compte les options fournies.
func GreetWithOptions(opts Options) string {
	cleanName := strings.TrimSpace(opts.Name)
	if cleanName == "" {
		cleanName = "Monde"
	}

	msg := fmt.Sprintf("Bonjour, %s ! Bienvenue sur l'application Go.", cleanName)
	if opts.Shout {
		return strings.ToUpper(msg)
	}
	return msg
}
