//Antonio Rubén Martínez Villegas
//Impares ascendentes
//Práctica 3
//23/09/2023
import java.util.Scanner;
public class _p48ImparesAscendente {
    public static void main(String[] args) {
        //variables.
        int numInicial, contador, suma, contadorP;
        char res;
        //Entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{
            suma= contadorP = 0;
            
            System.out.print("\033[H\033[2J");System.out.flush();


            System.out.print("Este programa imprime los numeros impares que existen entre el cero y un numero que usted elija.\n\n");
            System.out.println("Ingrese hasta que numero se van a imprimir los numeros impares: "); numInicial = DatoIng.nextInt();

            if(numInicial<0){
                contador = -1;
                do{
                    System.out.printf("%d ", contador);
                    suma +=contador;
                    contador-= 2;
                    contadorP++;
                }while(contador>=numInicial);
            }

            //En caso de que el usuario ingrese un numero positivo se crea su respectivo proceso.
            else{
                contador = 1;
                do{
                    System.out.printf("%d ", contador);
                    suma += contador;
                    contador += 2;
                    contadorP++;
                }while(contador<=numInicial);
            }

            //Se imprimen resultados
            System.out.printf("\nLa suma de los numeros es: %d\n\nEl promedio de los numeros es: %d\n", suma, suma/contadorP);

            System.out.println("\n¿Desea continuar(S|N)?"); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res !='N');

        System.out.println("Rifado, bro. Ten un buen día");
        DatoIng.close();
    }    
}