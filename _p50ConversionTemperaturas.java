//Antonio Rubén Martínez Villegas
//Conversión de temperaturas
//Práctica 3
//23/09/2023
import java.util.Scanner;
public class _p50ConversionTemperaturas {
    public static void main(String[] args) {
        //variables.
        int valorIn, valorFin;
        double fahrenheit;
        char res;

//entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        
        do{

            System.out.print("\033[H\033[2J"); System.out.flush();

            //Interrogamos al pobre imbécil
          
            System.out.print("¿Desde que temperatura desea que comienze la conversion?(Solo numeros enteros).\n"); valorIn = DatoIng.nextInt();
            System.out.print("¿Hasta que temperatura desea que se imprima la tabla?(Solo numeros enteros).\n "); valorFin = DatoIng.nextInt();
            System.out.println("-------------------------------\nCentígrados       Fahrenheit\n-------------------------------");
            
            do{
                fahrenheit = (valorIn*1.8)+32;
                if(valorIn>=10){
                    System.out.printf("%d°C       |       %.2f°F\n", valorIn, fahrenheit);
                }
                else{
                    System.out.printf("%d°C        |       %.2f°F\n", valorIn, fahrenheit);                    
                }
                valorIn++;
            }while(valorIn<=valorFin);
            System.out.println("-------------------------------\n\n");

            

            //Planteamos la opcion de reiniciar el programa.
            System.out.println("Desea reiniciar el programa? (S|N)"); res =  Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res !='N');
        System.out.println("\n Dale, hermano, te cuidas!!");
        DatoIng.close();
    }
}