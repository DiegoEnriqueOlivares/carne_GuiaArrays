//Leer 5 nombres de pokemon y mostralos en orden inverso al introducido.

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] pokemon = new String[5];

        for (int i=0; i<pokemon.length; i++){
            System.out.print("Ingrese el nombre del pokemon #"+(i+1)+" : ");
            pokemon[i] = scanner.nextLine();
        }

        System.out.println("\nEn orden original: ");
        for (String string : pokemon) {
            System.out.print(string+" - ");
        }

        System.out.println("\nEn orden inverso al introducido: ");
        for (int y=pokemon.length-1; y>=0; y--){
            System.out.print(pokemon[y]+" - ");
        }
    }
}
