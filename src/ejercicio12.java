import java.util.Scanner;

/*Pedir al usuario el nombre de un pokemon, buscarlo en el siguiente array si se
encuentra mostrar el indice en el que se encontro sino mostrar un mensaje
adecuado notificandolo*/
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombresPokemonB = { "Venusaur", "Blastoise", "Dragonite", "Gyarados",
                "Alakazam", "Arcanine", "Lapras", "Golem", "Gyarados", "Rhydon" };
        String nombrePokemon;

        System.out.print("Ingrese el nombre del Pokemon: ");
        nombrePokemon = scanner.nextLine();

        int indice=0;
        for (String y:nombresPokemonB) {
            if (y.equalsIgnoreCase(nombrePokemon)){
                break;
            }
            indice++;
        }

        if(indice>=0 && indice<nombresPokemonB.length){
            System.out.println("\nEl indice de "+nombrePokemon+" en el array es el: "+indice);
        } else {
            System.out.println("\nNo se encontro el indice de "+nombrePokemon+" en el array");
        }
    }
}
