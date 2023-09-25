import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args){
        
        
        
        
        Scanner scanner = new Scanner(System.in);
        int totalalumnos, totaldocentes, totaltrabajadores;
        int edad, i;
        System.out.println("Hola, ¿Que tipo de registro quieres hacer?");
        System.out.println("Presiona (1) para inscribir a un alumno");
        System.out.println("Presiona (2) para inscribir a un Docente");
        System.out.println("Presiona (3) para inscribir a un Trabajador");

        totalalumnos=0;
        edad=0;
        totaldocentes=0;
        totaltrabajadores=0;

        int opcion = scanner.nextInt();
        char M, H;
        int alummnosH, alumnasM;

        H=0;
        M=0;
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        if (opcion== 1) {
            System.out.println("¡Genial, eres un estudiante! ");
            System.out.println("Necesito que me digas tu edad, ¿Cunantos años tienes? ");
             edad = scanner.nextInt();
            System.out.print("\033[H\033[2J"); System.out.flush();

            if (edad>=18);{
                System.out.println("¡Genial! ¿Cuál es tu sexo?");
                System.out.println("Presiona M si eres mujer y H si eres hombre");
                int Sexo = scanner.nextInt();
                if (Sexo== H) {
                    for ( alummnosH = 0; alummnosH < 1; alummnosH++) {
                    }
                    System.out.println("Ok, eres mujer");
                }else if (Sexo== M) { 
                    for ( alumnasM = 0; alumnasM < 1; alumnasM++) {
                    }
                     System.out.println("Ok, eres mujer");
                }
            else if (edad<18);{
                System.out.println("Lo lamento, no es posible que ingreses siendo menor de edad.");
            }
            }

        }
        scanner.close();
    }
}