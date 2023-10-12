import java.util.Scanner;

/*Diseñar una aplicación que declare un array de 10 elementos enteros. Leer mediante
el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo en la posición indicada,
desplazando los que estén detrás.*/
public class ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        int posicion, numero;

        for (int i=0; i<8; i++){
            System.out.print("Ingrese el numero #"+(i+1)+": ");
            numeros [i] = scanner.nextInt();
        }
        for (int w=0; w<2; w++){
            System.out.print("\nIngrese el numero que desea insertar: ");
            numero= scanner.nextInt();
            
            do {
                System.out.print("\n¿En que posicion desea el numero? (0-9) ");
                posicion = scanner.nextInt();
                if (posicion<0 || posicion>9) {
                    System.out.println("\nEse numero esta fuera de rango");
                }
            } while (posicion<0 || posicion>9);
            

            for (int r=numeros.length-1; r>posicion; r--){
                numeros[r] = numeros[r-1];
            }
            numeros[posicion] = numero;
        }

        System.out.println(" ");
        for (int y=0; y<numeros.length; y++) {
            System.out.println("Matriz [ "+y+" ] : "+numeros[y]);
        }
    }
}
