import java.util.Scanner;

/*Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
último, el segundo, el
penúltimo, el tercero, etc.*/
public class ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];

        for (int i=0; i<numeros.length; i++){
            System.out.print("Ingrese el numero #"+(i+1)+" : ");
            numeros[i] = scanner.nextInt();
        }

        for (int y=0; y<numeros.length/2; y++){
            System.out.print(numeros[y]+" ");
            System.out.print(numeros[numeros.length-1-y]+" ");
        }

    }
}

