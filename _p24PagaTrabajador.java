//Antonio Rubén Martínez Villegas
//Sat Emulator
//Actividad 4
//30/08/2023

import java.util.Scanner;

public class _p24PagaTrabajador {
    public static void main(String[] args) {
        //Declaración de variables
        int horas, extra;
        float paga, total;
        Scanner obj = new Scanner(System.in);
        
        //Sentenciamos al pobre desgraciado
        System.out.println("Calculando la condena de un trabajador \n");
        System.out.print("¿Cuantas horas estará en la fosa? "); horas = obj.nextInt();
        System.out.print("¿Cuanto le pagan ? "); paga = obj.nextFloat();

        if( horas > 40 ) {
            extra = horas - 40;
            total = (40*paga) + (extra * paga * 2);
            System.out.printf("\nHoras extra: %d", extra);
        }
        else
                total = horas * paga;
        
        //Le decimos al pobre desgraciado cuantas tazas de arróz podrá comprár
        System.out.printf("\nPago total: %.2f", total);
        obj.close();
    }
}
