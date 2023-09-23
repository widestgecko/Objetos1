//Antonio Rubén Martínez Villegas
//Numero menor
//Practica 5
//21/09/2023
import java.util.Scanner;

public class _p75NumeroMenor {
    public static void main(String[] args) {
        int dig1, dig2, dig3, dig4;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingresa los numeros a verificar");
        System.out.print("Primer numero  : "); dig1 = obj.nextInt();
        System.out.print("Segundo numero : "); dig2 = obj.nextInt();
        System.out.print("Tercer numero  : "); dig3 = obj.nextInt();
        System.out.print("Cuarto numero  : "); dig4 = obj.nextInt();

        if (dig1 > dig2) {
            if (dig1 > dig3) {
                System.out.println(String.format("El numero %d es MENOR que los numeros %d, %d y %d", dig1, dig2, dig3,dig4));
            }else if (dig1 > dig4){
                System.out.println(String.format("El numero %d es MENOR que los numeros %d, %d y %d", dig1, dig2, dig3,dig4));
            }
            
        }else if (dig2 > dig1) {
            if (dig2 > dig3) {
                System.out.println(String.format("El numero %d es menor que los numeros %d, %d y %d", dig2, dig1, dig3,dig4));
            }else if (dig2 > dig4){
                System.out.println(String.format("El numero %d es menor que los numeros %d, %d y %d", dig2, dig1, dig3,dig4));
            }

                
        }else if (dig3 > dig1) {
                if (dig3 > dig2) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d, %d y %d", dig3, dig2, dig1, dig4));
            }else if (dig3 > dig4){
                System.out.println(String.format("El numero %d es menor que los numeros %d, %d y %d", dig2, dig1, dig3, dig4));
            }


        }else if (dig4 > dig1) {
                if (dig4 > dig2) {
                System.out.println(String.format("El numero %d es mayor que los numeros %d, %d y %d", dig3, dig2, dig1, dig4));
            }else if (dig4 > dig3){
                System.out.println(String.format("El numero %d es menor que los numeros %d, %d y %d", dig2, dig1, dig3, dig4 ));
            }

        obj.close();
    }
}  
} 







