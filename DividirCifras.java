//Antonio RuBén Martínez Villegas

import java.util.Scanner;

public class DividirCifras {
    public static void main(String[] args, Scanner scanner) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un numero de 3 cifras ?");
        int num=scanner.nextInt();

        int centenas = num/100;
        int decenas = (num - centenas*100)/10;
        int unidades = (num - (centenas*100 + decenas*10));

        System.out.println("El numero es: " + num);
        System.out.println("Centenas: "+ centenas);
        System.out.println("Decenas: "+ decenas);
        System.out.println("Unidades: "+ unidades);

    }
}