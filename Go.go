package main

import "fmt"

func main() {
	var a int
	fmt.Scanln(&a)
	var result float64 = (4.0 / 3.0) * 3.14159 * float64(a) * float64(a) * float64(a)
	fmt.Printf("VOLUME = %.3f\n", result)
}
