import java.util.Scanner;

/*Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se
obtiene la misma tabla al cambiar las filas por columnas.*/
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[4][4];
        boolean simetrica=true;

        System.out.println("Ingrese los valores de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz [i][j] = scanner.nextInt();;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }

        if (simetrica) {
            System.out.println("\nLa tabla es simetrica");
        } else {
            System.out.println("\nLa tabla no es simetrica");
        }
    }
}
