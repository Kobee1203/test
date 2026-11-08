# Application Go

Petite application console en Go avec un module et des tests unitaires standard (`go test`).

## Structure

- `main.go` : point d'entrée exécutable affichant un message dans la console.
- `greeter/greeter.go` : module fournissant la logique métier de salutation.
- `greeter/greeter_test.go` : tests unitaires du module `greeter`.
- `go.mod` : définition du module Go `example.com/go-app`.

## Prérequis

- Go (>= 1.21)

## Exécution

Lancer l'application console :
```bash
go run main.go
```

Ou compiler puis lancer le binaire :
```bash
go build -o app
./app
```

## Tests

Exécuter la suite de tests :
```bash
go test -v ./...
```
