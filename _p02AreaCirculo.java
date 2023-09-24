//Antonio Rubén Martínez Villegas
//Area de un circulo
//Actividad 1
//23/09/2023
import java.util.Scanner;
public class _p02AreaCirculo {
    public static void main(String[] args) {

        double radio, area;
        Scanner numIng = new Scanner(System.in);

        System.out.print("¿Cuál es el radio del círculo?: ");
        radio = numIng.nextFloat();

        //calculos.
        area= Math.PI * Math.pow(radio,2);

        System.out.println("El circulo de radio "+ radio +" tine un area de "+ area);
        numIng.close();
    }
}