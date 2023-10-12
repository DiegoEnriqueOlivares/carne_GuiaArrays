import java.util.Scanner;

/*Leer por teclado un array de 10 elementos numéricos enteros y una posición (entre
0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.*/
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        int posicion;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero #"+(i+1)+": ");
            numeros [i] = scanner.nextInt();
        }

        System.out.println("\nArray Original: ");
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Matriz [ "+i+" ] : "+numeros[i]);
        }

        do {
            System.out.print("\nIngrese la posicion del elemento que quiere eliminar (0-9) : ");
            posicion = scanner.nextInt();
            if (posicion<0 || posicion>9) {
                System.out.println("\nNumero fuera de rango");
            } else {
                for (int w = posicion; w < numeros.length-1; w++) {
                numeros[w] = numeros[w+1];
                }
                System.out.println("\nArray Modificado:");
                for (int y=0; y<numeros.length-1; y++) {
                    System.out.print(numeros[y]+" ");
                }
            }
        } while (posicion<0 || posicion>9);
    }
}
