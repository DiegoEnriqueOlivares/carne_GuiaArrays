import java.util.Scanner;

/*Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.*/
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz Original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        //transpuesta
        int auxiliar;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                auxiliar = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = auxiliar;
            }
        }

        System.out.println("\nMatriz Transpuesta: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

}
