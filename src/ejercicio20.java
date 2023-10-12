import java.util.Scanner;

/*Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.*/
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int[3][3];
        int [][] suma = new int[3][3];

        System.out.println("Ingrese la 1ra, matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz1 [i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nIngrese la 2da, matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz2 [i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < suma.length; j++) {
                suma [i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\nLa suma es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(suma[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
