#include <iostream>
int main () {
     //Definir variables y otros  
     printf("Ejercicio 01:Area del Triangulo\n");
     int b=0, h=0, area=0;
     //Datos de entrada
     printf("Ingrese Base:");
     scanf("%i", &b);
     printf("Ingrese Altura:");
     scanf("%i", &h);
     //Proceso
     area=(b*h)/2;
    //Datos de Salida
    printf("Area del Triangulo es:%i %s", area, "\n");
    return 0;
}