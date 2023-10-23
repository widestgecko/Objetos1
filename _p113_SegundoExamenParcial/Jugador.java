package _p113_SegundoExamenParcial;
public abstract class Jugador {
    private String nombre;
    private char sexo;
    private String descripcion;
    protected double salario;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public abstract double getBono();

    @Override
    public String toString() {
        return "Nombre del jugador: " + nombre + "Sexo del jugador: " + sexo + "Descripción del puesto del jugador: " + descripcion + "Salario del jugador: " + salario;
   }

    public char getSexo() {
        return 0;
    }
}

