import java.util.Scanner;

/*Crear un programa que lea por teclado un array de 10 números enteros y los
desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así
sucesivamente. El último pasa a ser el primero.*/
public class ejercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        int ultimo;

        for (int i=0; i<numeros.length; i++){
            System.out.print("Ingrese el numero #"+(i+1)+": ");
            numeros [i] = scanner.nextInt();
        }

        System.out.println("\nArray Original: ");
        for (int i : numeros) {
            System.out.print(i+" ");
        }

        ultimo = numeros[9];
        for (int w=numeros.length-1; w>0; w--){
            numeros[w] = numeros[w-1];
        }
        numeros[0]=ultimo;

        System.out.println("\nArray desplazado: ");
        for (int y:numeros) {
            System.out.print(y+" ");
        }
    }
}
