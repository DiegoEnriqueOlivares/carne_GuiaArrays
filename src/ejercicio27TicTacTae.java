import java.util.Scanner;

public class ejercicio27TicTacTae {
    public static Scanner scanner = new Scanner(System.in);

    public static void mostrarTablero (char tablero[][]){
        System.out.println(" ");
            System.out.println("\nTablero: ");
            System.out.println(" ");
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    if (j==tablero.length-1) {
                        System.out.print(" "+tablero[i][j]+"  ");
                    } else{
                        System.out.print(" "+tablero[i][j]+"  | ");
                    }
                }
            System.out.println(" ");
            if (i != tablero.length-1) {
                System.out.println("\n----------------");
            } 
            System.out.println(" ");
        }
    }

    public static void procesoJugadores(char tablero[][], int contador[]){
        int fila,columna;
        boolean espacioOcupado=false;

        mostrarTablero(tablero);
            if (contador[0]==1) {
                System.out.println("Jugador "+contador[0]);
            do {
                
                do {
                    System.out.print("\nIngresar la fila ( 0 , 1 , 2 ): ");
                    fila = scanner.nextInt();
                if (fila<0 || fila>2) {
                    System.out.println("\nEsa fila no existe");
                }
                } while (fila<0 || fila>2);
            
                do {
                    System.out.print("\nIngresar la columna ( 0 , 1 , 2 ): ");
                    columna = scanner.nextInt();
                if (columna<0 || columna>2) {
                    System.out.println("\nEsa columna no existe");
                }
                } while (columna<0 || columna>2);
                
                if (tablero[fila][columna]=='X' || tablero[fila][columna]=='O') {
                    System.out.println("\nEspacio ocupado eliga otro");
                    espacioOcupado=true;
                } else {
                    contador[0]=2;
                    tablero[fila][columna] = 'X';
                    espacioOcupado=false;
                }
            } while (espacioOcupado);
            
            } else if (contador[0]==2) {    
                System.out.println("Jugador "+contador[0]);
            do {
                do {
                    System.out.print("\nIngresar la fila ( 0 , 1 , 2 ): ");
                    fila = scanner.nextInt();
                if (fila<0 || fila>2) {
                    System.out.println("\nEsa fila no existe");
                }
                } while (fila<0 || fila>2);
            
                do {
                    System.out.print("\nIngresar la columna ( 0 , 1 , 2 ): ");
                    columna = scanner.nextInt();
                if (columna<0 || columna>2) {
                    System.out.println("\nEsa columna no existe");
                }
                } while (columna<0 || columna>2);
                
                if (tablero[fila][columna]=='X' || tablero[fila][columna]=='O') {
                    System.out.println("\nEspacio ocupado eliga otro");
                    espacioOcupado=true;
                } else {
                    contador[0]=1;
                    tablero[fila][columna] = 'O';
                    espacioOcupado=false;
                }
            } while (espacioOcupado);
        }
    }
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        int contador[] = new int[1];
        contador[0]=1;
        int jugadorGanador=0, acumulador;
        boolean ganador=false;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero [i][j] = ' ';
            }
        }
        do {
            procesoJugadores(tablero, contador);
            int r=0,y=0;
            acumulador=0;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    if (tablero[i][j]==' ') {
                        acumulador++;
                    }
                    if(tablero[i][r]=='X' && tablero[i][r+1]=='X' && tablero[i][r+2]=='X'){
                        ganador=true;
                        jugadorGanador=1;
                    } else if(tablero[i][r]=='O' && tablero[i][r+1]=='O' && tablero[i][r+2]=='O'){
                        ganador=true;
                        jugadorGanador=2;
                    } 

                    if (tablero[r][j]=='X' && tablero[r+1][j]=='X' && tablero[r+2][j]=='X') {
                        ganador=true;
                        jugadorGanador=1;
                    } else if(tablero[r][j]=='O' && tablero[r+1][j]=='O' && tablero[r+2][j]=='O'){
                        ganador=true;
                        jugadorGanador=2;
                    } 
                }
            }

            if (tablero[r][y]=='X' && tablero[r+1][y+1]=='X' && tablero[r+2][y+2]=='X') {
                ganador=true;
                jugadorGanador=1;
            } else if(tablero[r][y]=='O' && tablero[r+1][y+1]=='O' && tablero[r+2][y+2]=='O'){
                ganador=true;
                jugadorGanador=2;
            } else if (tablero[r][y+2]=='X' && tablero[r+1][y+1]=='X' && tablero[r+2][y]=='X') {
                ganador=true;
                jugadorGanador=1;
            } else if(tablero[r][y+2]=='O' && tablero[r+1][y+1]=='O' && tablero[r+2][y]=='O'){
                ganador=true;
                jugadorGanador=2;
            }
            
        } while (acumulador!=0 && ganador==false);
        
        if(ganador){
            mostrarTablero(tablero);
            System.out.println("\n!Jugador "+jugadorGanador+" ha ganado¡");
            System.out.println(" ");
        } else {
            mostrarTablero(tablero);
            System.out.println("\nEl juego resulto en un empate");
            System.out.println(" ");
        }
    }
}