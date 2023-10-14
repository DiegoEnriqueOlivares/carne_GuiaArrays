import java.util.Scanner;

public class ejercicio26Autobus {
    public static Scanner scanner = new Scanner(System.in);

    public static void devolverAsientos(int lado[], int ventas[]){
        int contador=0,indiceLibre=0,asientoDevuelto,cantidad,opcion;

        for (int i=0; i<lado.length; i++) {
            System.out.println("  Asiento #"+(i+1)+" ["+lado[i]+"] ");
            if (lado[i]==-1) {
            contador++;
            } else if(lado[i]==1) {
            indiceLibre=i;
            }
        }
            if(contador==lado.length){
                System.out.println("\nNo hay asientos vendidos, por lo cual no se pueden devolver");
            } else if (contador==lado.length-1){
                System.out.println("\nSolo el asiento #"+(indiceLibre+1)+" se puede devolver");
            do{
                System.out.println("\n¿Ese es su asiento? Si = 1  No = 2 ");
                opcion = scanner.nextInt();
                if (opcion<1 || opcion>2) {
                    System.out.println("\nRango no aceptado");
                } else if(opcion==1){
                    ventas[0]--;
                    lado[indiceLibre] = -1;
                    System.out.println("\nDevolucion exitosa" );
                } else {
                    System.out.println("\nAccion realizada con existo");
                    break;
                }
            } while (opcion<1 || opcion>2);
            } else{
                do {
                    System.out.print("\n¿Cuantos asientos compró? (1-2) ");
                    cantidad = scanner.nextInt();
                    if (cantidad<1 || cantidad>2) {
                        System.out.println("\nEse rango no existe");                        
                    }
                } while (cantidad<1 || cantidad>2);
                    for (int i = 0; i < cantidad; i++) {
                        do {
                            System.out.print("\nIngrese el numero del asiento a devolver: (1-"+lado.length+") ");
                            asientoDevuelto = scanner.nextInt();
                            if (asientoDevuelto<1 || asientoDevuelto>lado.length) {
                                System.out.println("\nRango no aceptado");
                            } else {
                                if(lado[asientoDevuelto-1]==-1){
                                    System.out.println("\nEste asiento no esta ocupado, por lo cual no se puede devolver");                                    asientoDevuelto=lado.length+1;
                                } else{
                                    lado[asientoDevuelto-1]=-1;
                                    ventas[0]--;
                                    System.out.println("\nDevolucion existosa");
                                }
                            }                  
                        } while (asientoDevuelto<1 || asientoDevuelto>lado.length);
                    }
                    
            }
    }

    public static void comprarAsientos(int lado[], int filas, int ventas[]){
        int contador=0,indiceLibre=-1,cantidadAsientos,opcionAsiento,opcion;
        
        System.out.println("\n");
        for (int i=0; i<lado.length; i++) {
            System.out.println("  Asiento #"+(i+1)+" ["+lado[i]+"] ");
            if (lado[i]==1) {
            contador++;
            } else if(lado[i]==-1) {
            indiceLibre=i;
            }
        }
            if(contador==lado.length){
                System.out.println("\nTodos los asientos estan ocupados");
            } else if (contador==lado.length-1){
                System.out.println("\nSolo el asiento #"+(indiceLibre+1)+" esta disponible");
            do{
                System.out.println("\n¿Quiere comprar el asiento a $0.25? Si = 1  No = 2 ");
                opcion = scanner.nextInt();
                if (opcion<1 || opcion>2) {
                    System.out.println("\nRango no aceptado");
                } else if(opcion==1){
                    ventas[0]++;
                    lado[indiceLibre] = 1;
                    System.out.println("\nCompra exitosa su asiento es el #"+(indiceLibre+1));
                } else {
                    System.out.println("\nAccion realizada con existo");
                    break;
                }
            } while (opcion<1 || opcion>2);
                                
            } else {
                do{
                    System.out.print("\n¿Que cantidad de asientos quiere comprar? $0.25c/u (1-2) : ");
                    cantidadAsientos = scanner.nextInt();
                    if (cantidadAsientos<1 || cantidadAsientos>2) {
                        System.out.println("\nEsa cantiad no se puede ingresar");
                    } else {
                        for (int j = 0; j < cantidadAsientos; j++) {
                            do{
                                System.out.print("\nEscoga el asiento a comprar: (1-"+lado.length+") : ");
                                opcionAsiento = scanner.nextInt();
                                            
                                if (opcionAsiento<1 || opcionAsiento>lado.length) {
                                    System.out.println("\nEse rango es invalido");
                                } else {                                
                                if (lado[opcionAsiento-1]==1) {
                                    System.out.println("\nEste asiento esta ocupado eliga otro");
                                    opcionAsiento=lado.length+1;
                                } else {
                                    ventas[0]++;
                                    lado[opcionAsiento-1] = 1;
                                    System.out.println("\nCompra existosa su asiento es el #"+opcionAsiento);
                                }
                                }
                            } while (opcionAsiento<1 || opcionAsiento>lado.length);
                        }
                    }
                } while (cantidadAsientos<1 || cantidadAsientos>2);            
    }
}
    public static void main(String[] args) {
        int filas,opcion,opcionLado=0;
        int totalVentas[] = new int[1];
        totalVentas[0]=0;
        double valorAsientos=0.25;

        do {     
            System.out.print("\nIngrese el numero de filas (6-10) para el microbus: ");
            filas = scanner.nextInt();
            if(filas<6 || filas>10){
            System.out.println("\nRango de filas no aceptado");
            }      
        } while (filas<6 || filas>10);
        int ladoDerecho[] = new int[filas];
        int ladoIzquierdo[] = new int[filas]; 

        for (int i = 0; i < filas; i++) {
            ladoDerecho[i] = -1;
            ladoIzquierdo[i] = -1;
        }

        do {
            System.out.println("\n¿Que desea hacer: "+
            "\n1. Ver distribucion de asientos"+
            "\n2. Vender asientos"+
            "\n3. Devolver asientos"+
            "\n4. Mostrar caja"+
            "\n5. Salir");
            opcion = scanner.nextInt();
        
            if (opcion==1) {
                System.out.println("Lado izquierdo: \t\tLado derecho: ");
                System.out.println("");
                for (int i = 0; i < ladoDerecho.length; i++) {
                    System.out.println("Asiento #"+(i+1)+" [ "+ladoIzquierdo[i]+" ]               Asiento #"+(i+1)+" [ "+ladoDerecho[i]+" ]");
                }
                
            } else if(opcion==2){
                do {
                    System.out.println("\n¿Que lado quiere escoger?"+
                    "\n1. Derecha"+
                    "\n2. Izquierda");
                    opcionLado = scanner.nextInt();
                if (opcionLado<1 || opcionLado>2) {
                    System.out.println("\nEsa opcion no existe");
                }
                    if (opcionLado==1) {
                        comprarAsientos(ladoDerecho, filas, totalVentas);    
                    } else if(opcionLado==2) {
                        comprarAsientos(ladoIzquierdo, filas, totalVentas);
                    }
                } while (opcionLado<1 || opcionLado>2);
            
            } else if(opcion==3){
                do {
                    System.out.println("\n¿De que lado estaba su asiento?"+
                    "\n1. Derecha"+
                    "\n2. Izquierda");
                    opcionLado = scanner.nextInt();
                    if(opcionLado<1 || opcionLado>2){
                        System.out.println("\nEse dato no se puede avaluar");
                    } 
                        if (opcionLado==1) {
                            devolverAsientos(ladoDerecho, totalVentas);
                        } else if (opcionLado==2){
                            devolverAsientos(ladoIzquierdo, totalVentas);
                        }
                    
                } while (opcionLado<1 || opcionLado>2);
            
            } else if(opcion==4){
                System.out.println("\nLos asientos vendidos son: "+totalVentas[0]);
                System.out.println("\nEl total de ventas de asientos es: $"+(totalVentas[0]*valorAsientos));
            }
        
        } while (opcion != 5);
        System.out.println("\nUsted ha salido del programa, !Muchas Gracias por preferirnos¡");
        System.out.println(" ");
    }
}
