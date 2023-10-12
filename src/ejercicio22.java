/*Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo
los de los bordes que deben ser 1.*/
public class ejercicio22 {
    public static void main(String[] args) {
        int [][] matriz = new int[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if(i==0 || i== 8-1 || j==0 || j==6-1){
                    matriz [i][j] = 1;
                } else {
                    matriz [i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
