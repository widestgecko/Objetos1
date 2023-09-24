//Antonio Rubén Martínez Villegas
//Paga esclavo
//Actividad 1
//23/09/2023
import java.util.Scanner;
public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        //Declaracion de variables 
        int horas;
        String nombre;
        float paga, bruta, tasa, impuesto, neta;

        //Eentrada de datos.
        Scanner datoIng = new Scanner(System.in);


        System.out.print("Nombre:           "); nombre = datoIng.nextLine();
        System.out.print("Horas trabajadas: "); horas = datoIng.nextInt();
        System.out.print("Paga por hora:    "); paga = datoIng.nextFloat();
        tasa = 0.3f;
        
        //Calculo de la paga neta
        bruta = horas * paga;
        impuesto = bruta * tasa;
        neta= bruta - impuesto;
    
        //Salida.
        System.out.println("Reesumen de pagos\n");
        System.out.println(String.format("El trabajador %s, trabajó %d horas, con una paga de %.2f pesos la hora, se asume una taza de impuesto de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta: %.2f",bruta));
        System.out.println(String.format("Impuesto: %.2f", impuesto));
        System.out.println(String.format("Paga neta: %.2f", neta));
        datoIng.close();
    }
}