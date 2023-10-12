import java.util.ArrayList;
import java.util.Scanner;

/*Crea un programa que encuentre el valor máximo y mínimo en un array de números
enteros. se debe llenar el array con números ingresados por el usuario.*/
public class ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero, i=0, numeroMaximo=0, numeroMinimo=1000000000;
        do {
            System.out.println("\nIngrese 0 para salir");
            System.out.print("Ingrese el numero #"+(i+1)+": ");
            numero = scanner.nextInt();
            if (numero!=0){
                numeros.add(i,numero);
                i++;
            }
        }while (numero!=0);

        for (int y:numeros) {
            if (y>=numeroMaximo){
                numeroMaximo=y;
            } else if (y<=numeroMinimo) {
                numeroMinimo=y;
            }
        }
        System.out.println("El valor maximo es: "+numeroMaximo+
                "\nEl valor minimo es: "+numeroMinimo);
    }
}
