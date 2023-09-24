//Antonio Rubén Martínez Villegas
//Pedro y pablo
//Actividad 1
//23/09/2023
public class _p01HolaMundo {
    public static void main(String[] args) {
        String amigo = "Pedro";
        String hermano = "Pablo";
        String mensaje = String.format("Tanto %s como %s desean aprender en Java", amigo, hermano);

        System.out.println("Hola Mundo en el Lenguaje Java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a Java" );
        System.out.println("\nMi amigo es " + amigo + " y mi hermano es " + hermano + "\n");
        System.out.println(mensaje);
    }
}