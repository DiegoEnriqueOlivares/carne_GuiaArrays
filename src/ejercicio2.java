/*Leer 5 números por teclado y a continuación realizar la media de los números
positivos, la media de los negativos y contar el número de ceros.*/

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[5];
        int sumaCeros=0;
        double sumaPositivos=0,sumaNegativos=0,mediaPositivos,mediaNegativos,positivos=0,negativos=0;

        for (int i=0; i<numeros.length; i++){
            System.out.print("Ingrese el numero #"+(i+1)+" : ");
            numeros[i] = scanner.nextInt();
        }

        for (int y:numeros) {
            if(y<0){
                sumaNegativos+=y;
                negativos+=1;
            } else if(y>0){
                sumaPositivos+=y;
                positivos+=1;
            } else {
                sumaCeros+=1;
            }
        }

        mediaNegativos = sumaNegativos/negativos;
        mediaPositivos = sumaPositivos/positivos;

        System.out.println("\nLa media de los positivos es: "+mediaPositivos+
                "\nLa media de los negativos es: "+mediaNegativos+
                "\nLa cantidad de ceros son: "+sumaCeros);

    }
}
