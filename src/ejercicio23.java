import java.util.Scanner;

/*"POKEDEX" Permite al usuario ingresar el nombre de un Pokémon y muestra sus
estadísticas completas si se encuentra.*/
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] estadisticasPokemon = {
                {"Pikachu", "90", "55", "40", "35"},        // Columna 0: Nombre del Pokémon
                {"Charizard", "100", "84", "78", "78"},     // Columna 1: Velocidad
                {"Bulbasaur", "45", "49", "49", "45"},      // Columna 2: Ataque
                {"Squirtle", "43", "48", "65", "44"},       // Columna 3: Defensa
                {"Mewtwo", "130", "110", "90", "106"},      // Columna 4: HP
                {"Gengar", "110", "65", "60", "60"},
                {"Dragonite", "80", "134", "95", "91"},
                {"Snorlax", "30", "110", "65", "160"},
                {"Vaporeon", "65", "60", "95", "130"},
                {"Machamp", "55", "130", "80", "90"},
                {"Eevee", "55", "55", "50", "55"},
                {"Alakazam", "120", "50", "45", "55"},
                {"Lapras", "60", "85", "80", "130"},
                {"Gyarados", "81", "125", "79", "95"},
                {"Jigglypuff", "20", "45", "20", "115"}
        };
        String nombrePokemon;

        System.out.print("Ingrese el nombre del pokemon que quiere saber sus atributos: ");
        nombrePokemon = scanner.nextLine();

        int indice = 0;
        for (int i = 0; i < estadisticasPokemon.length; i++) {
                if(estadisticasPokemon[i][0].equalsIgnoreCase(nombrePokemon)){
                    break;
                }
                indice++;
        }

        if (indice>=0 && indice<estadisticasPokemon.length){
            System.out.println("\nSu Pokemon es: "+estadisticasPokemon[indice][0]+
                    "\nSu velocidad es: " +estadisticasPokemon[indice][1]+
                    "\nSu ataque es: "+estadisticasPokemon[indice][2]+
                    "\nSu defensa es: "+estadisticasPokemon[indice][3]+
                    "\nSu HP es: "+estadisticasPokemon[indice][4]);
        } else {
            System.out.println("\nNo se encontro este Pokemon");
        }
    }
}
