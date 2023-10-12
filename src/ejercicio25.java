/*Realice un programa que verifique si una contraseña cumple con los siguientes
requisitos:
Tiene al menos 8 caracteres de longitud.
Contiene al menos 1 letra mayúscula.
Contiene al menos 1 letra minúscula.
Contiene al menos 1 dígito.
Contiene al menos 1 símbolo.*/

public class ejercicio25 {
    public static void main(String[] args) {
        String p = "Ax5@abcdefg";
        String simbolos = "!@#$%^&*()";
        boolean caracteres=false,letraMa=false,letraMi=false,digito=false,simbolo=false;

        for (int i = 0; i < p.length(); i++) {
            char caracter = p.charAt(i);

            if (i==8-1) {
                caracteres=true;
            } else if(Character.isUpperCase(caracter)){
                letraMa=true;
            } else if (Character.isLowerCase(caracter)) {
                letraMi=true;
            } else if (Character.isDigit(caracter)) {
                digito=true;
            } else if (simbolos.contains(simbolos)) {
                simbolo=true;
            }
        }
            if(caracteres && letraMa && letraMi && digito && simbolo){
                System.out.println("\nLa contraseña cumple los requisitos");
            } else {
                System.out.println("\nLa contraseña no cumple los requisitos");
            }
    }
}
