/*Encuentra y muestra el nombre del Pokémon con la mayor cantidad de poder*/
public class ejercicio16 {
    public static void main(String[] args) {
        String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur", "Squirtle"};
        int[] poderesPokemon = {100, 150, 80, 90};

        int indiceMayor=0;
        for (int i=0; i<poderesPokemon.length; i++) {
            if(poderesPokemon[i]>poderesPokemon[indiceMayor]){
                indiceMayor=i;
            }
        }

        System.out.println("\nEl Pokemon con mayor poder es: "+nombresPokemon[indiceMayor]+
                "\nY su poder es de: "+poderesPokemon[indiceMayor]);
    }
}
