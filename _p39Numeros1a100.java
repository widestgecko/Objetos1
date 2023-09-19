//Antonio Rubén Martínez Villegas
//Numeros1a100
//Actividad 7
//19/09/2023
public class _p39Numeros1a100 {
    public static void main(String[] args) {

        //Variables
        int numeros = 1;


        System.out.print("\033[H\033[2J"); System.out.flush();

        //Iniciamos el ciclo while
        while( numeros <= 100 ) {
            System.out.print(numeros+" ");
            numeros+=1;
        }
        System.out.println("\nProceso terminado ...");
    }
}