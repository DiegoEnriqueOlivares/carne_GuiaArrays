import java.util.Scanner;

/*Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si
los números están ordenados de forma creciente, decreciente, o si están desordenados.*/
public class ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        boolean creciente = false, decreciente = false, iguales=true;

        for (int i=0; i<numeros.length; i++){
            System.out.print("Ingrese el numero #"+(i+1)+": ");
            numeros [i] = scanner.nextInt();
        }

        for (int y=1; y<numeros.length; y++) {
            if (numeros[y] > numeros[y - 1]) {
                creciente = true;
                iguales = false;
            } else if (numeros[y] < numeros[y - 1]) {
                decreciente = true;
                iguales = false;
            }
        }

        if (decreciente && creciente){
            System.out.println("\nLa serie de numeros esta desordenada");
        } else if (decreciente==false && creciente) {
            System.out.println("\nLa serie de numeros esta ordenada de formar creciente");
        } else if (creciente==false && decreciente) {
            System.out.println("\nLa serie de numeros esta ordenada de forma decreciente");
        } else if (iguales) {
            System.out.println("\nTodos los numeros son identicos");
        }
    }
}
