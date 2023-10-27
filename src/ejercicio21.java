import java.util.Scanner;

/*Invertir orden de un array*/
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        System.out.println("Ingrese la cantidad de numeros del array: " );
        cantidad = scanner.nextInt();
        int [] numeros = new int[cantidad];

        System.out.println("\nIngrese los numeros del array : ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero #"+(i+1)+" : ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nArray ingresado: ");
        for (int y:numeros) {
            System.out.print(y+" ");
        }

        for (int i = 0; i < numeros.length/2; i++) {
            int aux=numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] = numeros[i];
            numeros[i] = aux;
        }

        System.out.println("\nArray invertido: ");
        for (int i:numeros) {
            System.out.print(i+" ");
        }
    }
}
