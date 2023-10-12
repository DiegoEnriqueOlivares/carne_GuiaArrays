import java.util.Scanner;

public class ejercicio28Registro {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numeroEstudiantes,cantidadPeriodos,opcion,numeroPeriodo,numeroEstudiante;
        
        do {
            System.out.print("\nIngrese la cantidad de estudiantes: (1-10) ");
            numeroEstudiantes = scanner.nextInt();
            if(numeroEstudiantes<1 || numeroEstudiantes>10){
                System.out.println("\nNumero fuera del rango");
            }
        } while (numeroEstudiantes<1 || numeroEstudiantes>10);

        do {
            System.out.print("\nIngrese la cantidad de periodos: (3-5) ");
            cantidadPeriodos = scanner.nextInt();
            if(cantidadPeriodos<3 || cantidadPeriodos>5){
                System.out.println("\nNumero fuera del rango");
            }
        } while (cantidadPeriodos<3 || cantidadPeriodos>5);

        double [][] calificaciones= new double[cantidadPeriodos][numeroEstudiantes];

        do {
            System.out.println("\n¿Que quiere hacer?"+
                            "\n1. Ingresar calificaciones por periodo"+
                            "\n2. Ingresar calificaciones por estudiante"+
                            "\n3. Ver calificaciones"+
                            "\n4. Salir");
            opcion=scanner.nextInt();
            
            if (opcion<1 || opcion>4) {
                System.out.println("\nEsa opcion no existe");
            } else {
                
                if (opcion==1) {
                    do {
                    System.out.print("\nIngrese el numero del periodo: (1-"+cantidadPeriodos+") ");
                    numeroPeriodo = scanner.nextInt();
                        if (numeroPeriodo<1 || numeroPeriodo>cantidadPeriodos) {
                            System.out.println("\nEse periodo no esta en el rango");
                        } else {
                            for (int i = 0; i < numeroEstudiantes; i++) {
                                do {
                                    System.out.print("\nIngrese la nota del estudiante #"+(i+1)+" : (0-10) ");
                                    calificaciones[numeroPeriodo-1][i] = scanner.nextDouble();
                                    if (calificaciones[numeroPeriodo-1][i]<0 || calificaciones[numeroPeriodo-1][i]>10) {
                                        System.out.println("\nCalificacion fuera de rango");
                                    }                      
                                } while (calificaciones[numeroPeriodo-1][i]<0 || calificaciones[numeroPeriodo-1][i]>10);
                            }
                        }
                    } while (numeroPeriodo<1 || numeroPeriodo>cantidadPeriodos);
                }
        
                else if(opcion==2){
                    do {
                    System.out.print("\nIngrese el numero del estudiante: (1-"+numeroEstudiantes+") ");
                    numeroEstudiante = scanner.nextInt();
                        if (numeroEstudiante<1 || numeroEstudiante>numeroEstudiantes) {
                            System.out.println("\nEse estudiante no existe");
                        } else {
                            do{
                                System.out.print("\nIngrese el numero del periodo: (1-"+cantidadPeriodos+") ");
                                numeroPeriodo = scanner.nextInt();
                                if (numeroPeriodo<1 || numeroPeriodo>cantidadPeriodos) {
                                    System.out.println("\nEse periodo no esta en el rango");
                                } else {
                                    do {
                                        System.out.print("\nIngrese la nota del estudiante : (0-10) ");
                                        calificaciones[numeroPeriodo-1][numeroEstudiante-1] = scanner.nextDouble();
                                        if (calificaciones[numeroPeriodo-1][numeroEstudiante-1]<0 || calificaciones[numeroPeriodo-1][numeroEstudiante-1]>10) {
                                            System.out.println("\nCalificacion fuera de rango");
                                        }                      
                                    } while (calificaciones[numeroPeriodo-1][numeroEstudiante-1]<0 || calificaciones[numeroPeriodo-1][numeroEstudiante-1]>10);
                                }
                            } while (numeroPeriodo<1 || numeroPeriodo>cantidadPeriodos);
                        }
                    } while (numeroEstudiante<1 || numeroEstudiante>numeroEstudiantes);
                }

                else if (opcion==3) {
                    for (int i = 0; i < cantidadPeriodos; i++) {
                    System.out.println(" \n ");
                    System.out.println("\n \t Periodo "+(i+1));
                
                        for (int j = 0; j < numeroEstudiantes; j++) {
                            System.out.println("\n--------------------------");
                            System.out.print("|  Estudiante "+(j+1)+"  !  "+calificaciones[i][j]+"  |");
                            if (j==(numeroEstudiantes-1)) {
                                System.out.print("\n--------------------------");
                            }
                        }
                    }   
                }

                else if (opcion==4) {
                    System.out.println("\n!Gracias por preferirnos, vuelva pronto¡");
                    System.out.println(" ");
                }
            }
        } while (opcion!=4);
    }
}