public class _P01_HolaMundo{
    public static void main(String[] args) {
        String amigo= "Antonio";
        String hermana= "Natalia"; 
        String Mensaje= String.format("Tanto %s como %s desean aprender a programar en java", amigo, hermana);

        System.out.println("Hola Mundo en lenguaje java");
        System.out.println("\nMi amigo es " + amigo + "bienvvenido a Java");
        System.out.println("\nMi amigo es " + amigo + "y mi hermana es" + hermana + "\n");
        System.out.println(Mensaje);
    }

}