package main
import "fmt"
func main() {
 //Declaracion de variables y otros
 fmt.Println("Ejercicio 01: Area Triangulo")
 var b int
 var h int
 var area float64
 //Datos de lectura
 fmt.Println("Ingrese Base:")
 fmt.Scanln(&b)
 fmt.Println("Ingrese Altura:")
 fmt.Scanln(&h)
 //Proceso
 area=float64((b*h)/2)
 //Datos de salida
 fmt.Println("El area es: ", area)
} 
