//Antonio Rubén Martínez Villegas
//Verificación numerica
//Actividad 4
//30/08/2023

import java.util.Scanner;
public class _p21VerificaNumero {
    public static void main(String[] args) {
        int nume;
        //Proceso de evaluación
        System.out.println("Verfica si un número es postivo, negativo o cero\n");
        System.out.print("En que número estás pensando? ");
        nume = new Scanner(System.in).nextInt();
        //Evaluación por los "if"
        if( nume>0 )

        System.out.println("El número es POSITIVO, my brotha ");

        if( nume<0 )

        System.out.println("El número es NEGATIVO, my brotha");

        if( nume==0 )

        System.out.println("El número es CERO");


    }
}
