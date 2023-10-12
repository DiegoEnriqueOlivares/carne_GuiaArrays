import java.util.Scanner;

/*Pedir un numero entero (index) validar que este en el rango del array proporcionado
y mostrar el nombre del pokemon que se encuentra en ese indice.*/
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombresPokemonB = { "Venusaur", "Blastoise", "Dragonite", "Gyarados",
                "Alakazam", "Arcanine", "Lapras", "Golem", "Gyarados", "Rhydon" };
        int opcion;

        System.out.print("Ingrese el numero de rango que quiere saber su contenido (0-9): ");
        opcion = scanner.nextInt();

        if (opcion>=0 && opcion< nombresPokemonB.length){
            System.out.println("\nEl pokemon en esa posicion es: "+nombresPokemonB[opcion]);
        } else {
            System.out.println("\nEsa opcion no esta en el rango");
        }
    }
}
