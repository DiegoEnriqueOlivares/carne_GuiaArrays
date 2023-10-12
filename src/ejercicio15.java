import java.util.Scanner;

/*Dado un conjunto de nombres de Pokémon almacenados en un array y otro
conjunto de sus respectivas cantidades de poder almacenadas en otro array, se
solicita al usuario ingresar un nombre de Pokémon y una cantidad de poder. El
objetivo es buscar el nombre del Pokémon proporcionado por el usuario en el array
de nombres. Si se encuentra el nombre del Pokémon en el array, se actualizará la
cantidad de poder asociada a ese Pokémon con la cantidad proporcionada por el
usuario.*/
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombresPokemon = {"pikachu", "charizard",
                "bulbasaur", "squirtle", "jigglypuff"};
        int[] poderesPokemon = {100, 150, 80, 90, 120};
        String nombre;
        int nuevoPoder;

        System.out.print("Ingrese el nombre del pokemon: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su nuevo nivel de poder: ");
        nuevoPoder = scanner.nextInt();

        int posicion=0;
        for (String i:nombresPokemon) {
            if(i.equalsIgnoreCase(nombre)){
                break;
            }
            posicion++;
        }

        if(posicion>=0 && posicion<nombresPokemon.length){
            System.out.println("\nEl pokemon "+nombre+" tiene un nivel de poder de: "+poderesPokemon[posicion]);
            poderesPokemon[posicion] = nuevoPoder;
            System.out.println("El pokemon "+nombre+" con su nuevo nivel de poder es de: "+poderesPokemon[posicion]);
        } else {
            System.out.println("\nEl nombre del pokemon no ha sido encontrado.");
        }
    }
}
