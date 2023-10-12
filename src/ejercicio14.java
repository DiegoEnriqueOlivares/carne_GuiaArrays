/*Dado el siguiente array ordenar en orden ascendente y descendente utilizando dos
métodos de ordenamiento puede usar el que desee.*/
public class ejercicio14 {
    public static void main(String[] args) {
        int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98, 45};

        //metodo burbuja
        for (int i = 0; i < numerosDesordenados.length-1; i++) {
            for (int j = 0; j < numerosDesordenados.length-1; j++) {
                if(numerosDesordenados[j]>numerosDesordenados[j+1]){
                    int aux = numerosDesordenados[j];
                    numerosDesordenados[j] = numerosDesordenados[j+1];
                    numerosDesordenados[j+1] = aux;
                }
            }
        }

        System.out.println("\nEn forma ascendente: ");
        for (int y:numerosDesordenados) {
            System.out.print(y+" ");
        }
        /*
        System.out.println("\nEn forma descendente:");
        for (int w= numerosDesordenados.length-1; w>=0; w--) {
            System.out.print(numerosDesordenados[w]+" ");
        }*/

        for (int r = 0; r < numerosDesordenados.length-1; r++) {
            for (int j = 0; j < numerosDesordenados.length-1; j++) {
                if(numerosDesordenados[j]<numerosDesordenados[j+1]){
                    int aux = numerosDesordenados[j];
                    numerosDesordenados[j] = numerosDesordenados[j+1];
                    numerosDesordenados[j+1] = aux;
                }
            }
        }

        System.out.println("\nEn forma descendente:");
        for (int w:numerosDesordenados) {
            System.out.print(w+" ");
        }

        //metodo de insercion
        /* for (int i = 0; i < numerosDesordenados.length; i++) {
            int posicion=i, auxiliar=numerosDesordenados[i];

            while(posicion>0 && numerosDesordenados[i-1]>auxiliar){
                numerosDesordenados[i] = numerosDesordenados[i-1];
                posicion--;
            }
            numerosDesordenados[posicion] = auxiliar;
            }   */
    }
}
