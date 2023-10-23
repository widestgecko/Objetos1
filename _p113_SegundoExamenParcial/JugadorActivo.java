package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
        private int partidos;
        private int goles;
    
        public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
            super(nombre, sexo, descripcion, salario);
            this.partidos = partidos;
            this.goles = goles;
        }
    
        public int getPartidos() {
            return partidos;
        }
    
        public int getGoles() {
            return goles;
        }
    
        public String getTotal() {
            return getSalario() + getBono();
        }
    
        private double getSalario() {
            return 0;
        }

        public String getBono() {
            return (getSalario() * 0.10) + (partidos * 50) + (goles * 5);
        }
    
        @Override
        public String toString() {
            return super.toString() +
                    "\nPartidos jugados: " + partidos +
                    "\nGoles anotados: " + goles +
                    "\nTotal: " + getTotal();
        }
}

