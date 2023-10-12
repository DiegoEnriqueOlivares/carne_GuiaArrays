import java.util.Scanner;

/*Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
Éstos los guardaremos en un array de tamaño 10. Leer un número N, e insertarlo en
el lugar adecuado para que el array continúe ordenado.*/
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        int numeroAdicional;
        boolean creciente=false;
        
        do {
            
            System.out.println("\nIngrese los numeros de forma ordenada creciente");
            for (int i=0; i<5; i++){
                System.out.print("Ingrese el numero #"+(i+1)+": ");
                numeros [i] = scanner.nextInt();
            }

            for (int i = 1; i < 5; i++) {
                if (numeros[i] > numeros[i - 1]) {
                    creciente = true;
                } else if (numeros[i] < numeros[i - 1]) {
                    creciente = false;
                }
            }

            if(creciente==false){
                System.out.println("\nNo esta en forma creciente");
            }

        } while (creciente==false);
        
        for (int r=0; r<5; r++){
            System.out.print("\nIngrese el numero #"+(r+1)+" para insertar : ");
            numeroAdicional = scanner.nextInt();
            int posicion;
            for (posicion = 4 + r; posicion >= 0 && numeros[posicion] > numeroAdicional; posicion--) {
                numeros[posicion + 1] = numeros[posicion];
            }
            numeros[posicion + 1] = numeroAdicional;
        }

        System.out.println(" ");
        for (int y:numeros) {
            System.out.print(y+" ");
        }
    }
}
