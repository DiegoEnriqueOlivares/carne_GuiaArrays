import java.util.ArrayList;

/*Dado el siguiente array crear otro array donde guardara el array original sin los
números duplicados*/
public class ejercicio24 {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        boolean numeroDiferente=true;

        int contador = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            numeroDiferente = true;
            for (int j = 0; j < i; j++) {
                if (arrayOriginal[i] == arrayOriginal[j]) {
                    numeroDiferente = false;
                    break;
                }
            }
            if (numeroDiferente) {
                contador++;
            }
        }

        int[] sinDuplicados = new int[contador];
        int contador2 = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            numeroDiferente = true;
            for (int j = 0; j < i; j++) {
                if (arrayOriginal[i] == arrayOriginal[j]) {
                    numeroDiferente = false;
                    break;
                }
            }
            if (numeroDiferente) {
                sinDuplicados[contador2] = arrayOriginal[i];
                contador2++;
            }
        }

        System.out.println(" ");
        for (int y:sinDuplicados) {
            System.out.print(y+" - ");
        }
        System.out.println(" \n ");
    }
}
