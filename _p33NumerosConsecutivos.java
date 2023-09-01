//Antonio Rubén Martínez Villegas
//NumerosConsecutivos
//Práctica 2
//01/09/2023

import java.util.Scanner;
public class _p33NumerosConsecutivos {
    public static void main(String[] args) {
           int num1,num2,num3;
            Scanner obj = new Scanner(System.in);
            System.out.print("Dime el primer numero "); num1 = obj.nextInt();
            System.out.print("Dime el segundo numero "); num2 = obj.nextInt();
            System.out.print("Dime el tercer nummero "); num3 = obj.nextInt();
            if (num2 == num1 + 1 && num3 == num2 + 1) {
                System.out.println("Los números son consecutivos.");
            } else {
                System.out.println("Los números no son consecutivos.");
            }
            obj.close(); 
        }
    }    


