//Leer 5 números y mostrarlos en el mismo orden introducido.

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[5];

        for (int i=0; i<numeros.length; i++){
            System.out.print("Ingrese el numero #"+(i+1)+" : ");
            numeros [i] = scanner.nextInt();
        }
        System.out.println(" ");

        for (int y=0 ; y<numeros.length ; y++) {
            System.out.println("El #"+(y+1)+" ingresado fue: "+numeros[y]);
        }

    }

}