//Antonio Rubén Martínez Villegas
//Area de un Triangulo
//Actividad 1
//23/09/2023
import java.util.Scanner;
public class _p03AreaDeunTriangulo {
    public static void main(String[] args) {
        //Declaramos variables.
        int base, altura;
        double area;

        Scanner datoIng = new Scanner(System.in);

        
        System.out.println("Este programa calcula el area de un triangulo. Presione ENTER para continuar.");
        datoIng.nextLine();
        System.out.print("Digita la base del triangulo.");
        base = datoIng.nextInt();
        System.out.print("Digita la altura: ");
        altura = datoIng.nextInt();

        //Realizamos los calculos.
        area = base*altura/2;

        //Resultado
        System.out.println(String.format("El triangulo de base %d y altura %d tiene un area de %.2f", base, altura, area));
        datoIng.close();
    } 
}