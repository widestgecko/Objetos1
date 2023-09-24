//Antonio Rubén Martínez Villegas
//Pares Descendentes
//Práctica 3
//23/09/2023

import java.util.Scanner;
public class _p49ParesDescendente {
    public static void main(String[] args) {
        //variables.
        int ini, conta, suma, contador1;
        char res;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Comenzamos programa.
        do{
            //Asignamos valores a las variables.
            suma = contador1 = 0;

            //Limpamos pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtencion de datos.
            System.out.println("Este programa imprime todos los numeros enteros pares, de forma descendente, que existen entre el cero y un numero que usted elija.\n\n");
            System.out.print("Ingrese el numero par final: "); ini = DatoIng.nextInt();

            //En caso de que el numero ingresado sea negativo creamos un proceso para dicho caso.
            if(ini<0){
                if(ini%2 == 0 ){
                    conta = ini;
                    do{
                        System.out.printf("%d ", conta);
                        suma += conta;
                        contador1++;
                        conta += 2;
                    }while(conta<=0);
                }
                else{
                    conta = ini+1;
                    do{
                        System.out.printf("%d ", conta);
                        suma += conta;
                        contador1++;
                        conta += 2;
                    }while(conta<=0);
                }
            }


            else{
                if(ini%2 == 0){
                    conta = ini;
                    do{
                        System.out.printf("%d ", conta);
                        suma += conta;
                        contador1++;
                        conta -= 2;
                    }while(conta>=0);
                }
                else{
                    conta = ini-1;
                    do{
                        System.out.printf("%d ", conta);
                        suma += conta;
                        contador1++;
                        conta -= 2;
                    }while(conta>=0);
                }
            }
            //Presentamos los resultados.
            System.out.printf("\nLa suma de todos los numeros pares entre 0 y %d es: %d\n\nEl promedio de los numeros encontrados es: %d\n", ini, suma, suma/contador1);

            //Planteamos la opcion de reiniciar el programa.
            System.out.println("Desea reiniciar el programa? (S|N)"); res =  Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n Nah, bro. Sos tremenedo");
        DatoIng.close();
    }
}