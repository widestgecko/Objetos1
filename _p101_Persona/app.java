package _p101_Persona;

import _p106_Persona.Persona;

public class app {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Trabajo trabajo = new Trabajo();
        trabajo.setId(1);
        trabajo.setRol("Dealer");
        trabajo.setSalario(2010000000);
        persona1.setNombre("Azazel Martínez");
        persona1.setTrabajo(trabajo);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println(persona1);
        Persona persona2 = new Persona("Jose Perez", new Trabajo(2, "Cocinero", 2500));
        System.out.println(persona2);
    }
}