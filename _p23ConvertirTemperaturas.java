//Antonio Rubén Martínez Villegas
//Convertidor temperatura
//Actividad 4
//30/08/2023

import java.util.Scanner;
public class _p23ConvertirTemperaturas {
    public static void main(String[] args) {
        //Adoro el "Char"
    char opcion;
    //Declarar variables
        float temp, resultado;

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Convertir de grados celcius a farenheit y viceversa\n");

        //El usuario elige la unidad de medida que consultará
        System.out.println("[F]arenheit a Centigrados");
        System.out.println("[C]entigrados a Farenheit ");
        System.out.print("Elije una opcion ? "); opcion = obj.next().charAt(0);
        opcion = Character.toUpperCase(opcion);

        //Proceso usado en caso de grados Farenheit
        if( opcion=='F' ) {
            System.out.println("\nConvertir de Farenheit a Centigrados\n");
            System.out.print("Dame los grados Farenheit ? "); temp = obj.nextFloat();
            resultado = ( temp - 32 ) * 5 / 9;
            System.out.printf("%.2f Farenheit, equivale a %.2f Centigrados", temp, resultado);
        }
        
        //Proceso usado en caso de grados Centigrados
        else{
            System.out.println("\nConvertir de Centigrados a Farenheit\n");
            System.out.print("Dame los grados Centigrados ? "); temp = obj.nextFloat();
            resultado = ( temp * 9 / 5 ) + 32;
            System.out.printf("%.2f Centigrados, equivale a %.2f Farenheit", temp, resultado);;
        }
        System.out.println("\nGracias por utilizar este programa");
    }
}