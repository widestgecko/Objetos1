//Antonio Rubén Martínez Villegas
//Primer examen de Java
//Examen 1
//25/09/2023
import java.util.Scanner;

public class proyecto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        int totalDineroAlumnos = 0;
        int totalDineroDocentes = 0;
        int totalDineroTrabajadores = 0;
        int totalDineroGeneral = 0;
        int sumaEdades = 0;


        System.out.println("Bienvenido a mi examen que ingresa gente ");
        System.out.println("Rifese con los datos de los imgresados.");
        while (true) {


                System.out.print("Nombre: ");
                String nombre = input.nextLine();

                if (nombre.isEmpty()) {
                    break;
                }

                System.out.print("Dime tu edad, Aprendiz: ");
                int edad = Integer.parseInt(input.nextLine());

                System.out.print("¿Cual es tu sexo? M para mujer y H para hombre: ");
                String sexo = input.nextLine();

                System.out.print("Tipo de Participante (Alumno/Docente/Trabajador): ");
                String tipoParticipante = input.nextLine();

                if (edad >= 18) {
                    totalParticipantes++;

                    switch (tipoParticipante.toLowerCase()) {
                        case "alumno":
                            totalAlumnos++;
                            totalDineroAlumnos += 50;
                            break;
                        case "docente":
                            totalDocentes++;
                            totalDineroDocentes += 80;
                            break;
                        case "trabajador":
                            totalTrabajadores++;
                            totalDineroTrabajadores += 60;
                            break;
                    }


                    sumaEdades += edad;

                    System.out.println("¿Ya terminaste, carnal?");
            }
        }

        double promedioEdad = (double) sumaEdades / totalParticipantes;

        totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;


        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes:");
        input.close();
    }

 }
