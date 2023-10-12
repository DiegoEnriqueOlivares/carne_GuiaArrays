/*Dado los siguientes Arrays mezclar los nombres de Pokémon de los arrays
nombresPokemonA y nombresPokemonB en un tercer array
nombresPokemonC de la forma el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.),*/
public class ejercicio6 {
    public static void main(String[] args){
        String[] nombresPokemonA = { "Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Snorlax", "Gengar", "Machamp" };
        String[] nombresPokemonB = { "Venusaur", "Blastoise", "Dragonite", "Gyarados", "Alakazam", "Arcanine", "Lapras", "Golem", "Gyarados", "Rhydon" };
        String[] nombresPokemonC = new String[nombresPokemonA.length+ nombresPokemonB.length];
        int indicePokemonA=0, indicePokemonB=0;

        for (int i=0; i< nombresPokemonC.length; i+=2){
                nombresPokemonC[i] = nombresPokemonA[indicePokemonA++];
                nombresPokemonC[i+1] = nombresPokemonB[indicePokemonB++];
        }

        for (String y:nombresPokemonC) {
            System.out.println(y);
        }
    }
}
