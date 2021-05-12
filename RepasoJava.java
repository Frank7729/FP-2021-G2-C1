import java.util.Scanner;

public class RepasoJava {
    static Scanner objTecla1=new Scanner(System.in);
    static int a=10;
    static double e=5;
    char b;
    short c;
    float d;
    long f;

public static void saludo() {
    System.out.println("Dime tu nombre:");
    String nombre=objTecla1.next();
    System.out.println("Hola"+nombre);
}

public static void saludo2() {
    System.out.println("Hola Mundo");
}

public static void operacionBasicas(){
    System.out.println("Suma:"+(a+e));
    System.out.println("Resta:"+(a-e));
    System.out.println("Division:"+(a/e));
    System.out.println("Multiplicaion:"+(a*e));
    System.out.println("Potencia:"+(Math.pow(a, e)));
}

public void operacionBasicas2(){
    System.out.println("Suma:"+(a+e));
    System.out.println("Resta:"+(a-e));
    System.out.println("Division:"+(a/e));
    System.out.println("Multiplicaion:"+(a*e));
    System.out.println("Potencia:"+(Math.pow(a, e)));

}


public static void main(String[] args) {
    //saludo2();
    //saludo();

    RepasoJava objRJ=new RepasoJava();
    objRJ.operacionBasicas2();

}


}