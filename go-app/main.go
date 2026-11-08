package main

import (
	"fmt"
	"strings"

	"example.com/go-app/greeter"
)

func main() {
	message := greeter.Greet("Développeur")

	fmt.Println(strings.Repeat("=", 50))
	fmt.Println(message)
	fmt.Println(strings.Repeat("=", 50))
}
