package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
        private int subordinados;
        private int proyectos;
    
        public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
            super(nombre, sexo, descripcion, salario);
            this.subordinados = subordinados;
            this.proyectos = proyectos;
        }
    
        @Override
        public double getBono() {
            double salario;
            return (salario * 0.15) + (proyectos * 100) + (subordinados * 10);
        }
    
        @Override
        public String toString() {
            return super.toString() +
                "Subordinados a cargo del jugador entrenador: " + subordinados + "\n" +
                "Proyectos en los que ha participado el jugador entrenador: " + proyectos + "\n" +
                "Total: " + (salario + getBono()) + "\n";
    }
}

