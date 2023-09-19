//Antonio Rubén Martínez Villegas
//Calcular la Hipotenusa
//Practica 1 
//25/08/2023

import java.util.Scanner;
public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        //Variables de Gran capacidad
        Double CatetoA, CatetoB, Hip;

        //Entrada de datos
        Scanner Usuario = new Scanner(System.in);

        //Obtenemos los datos.
        System.out.println("A calcular la hipotenusa.");
        System.out.println("Presiona Enter.");
        Usuario.nextLine();
        System.out.println("¿Cuál es el primer cateto?: ");
        CatetoA = Usuario.nextDouble();
        System.out.println("¿Cuál es el segundo cateto?: ");
        CatetoB = Usuario.nextDouble();
        
        //Limpiamos la consola
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Se realizan los calculos.
        Hip = Math.sqrt((CatetoA*CatetoA) + (CatetoB*CatetoB));
        
        //Se muestran los resultados en pantalla.
        System.out.println(String.format("La hipotenusa del triangulo es de: %.2f.", Hip));
        Usuario.close();
    }
}
