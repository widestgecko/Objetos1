//Antonio Rubén Martínez Villegas
//Día de k¿la semana
//Practica 5
//21/09/2023
import java.util.Scanner;

public class _p76DiaSemana {

    public static void main(String[] args) {
        int dia;
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingresa un nímero para saber que día de la semana estás pensando : "); dia = obj.nextInt();

        System.out.print("\033[H\033[2J"); System.out.flush();

        if(dia<=0) {
            System.out.println("No digas mamadas meriyein");
        }else if (dia>7){
            System.out.println("No digas mamadas meriyein");                
            }
        else if (dia==1){
            System.out.println("Es Lunes de actos belicos");            
        }else if (dia==2){
            System.out.println("Martes amor al progimo");            
        }else if (dia==3){
            System.out.println("Es miercoles de prensamientos auto destructivos");
        }else if (dia==4){
            System.out.println("Feliz jueves");
        }else if (dia==5){
            System.out.println("Viernes de fraude fiscal");
        }else if (dia==6){
            System.out.println("Es sábado de sabadazo");
        }else if (dia==7){
            System.out.println("Es domingo de amar y ser amado");
        }
        obj.close();

    }
}
