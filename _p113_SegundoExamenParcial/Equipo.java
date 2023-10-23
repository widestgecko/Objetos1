package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(JugadorEntrenador jugadorEntrenador, Jugador jugadorEntrenadorEntrenador) {
        jugadores.add(jugadorEntrenadorEntrenador);
    }

    public double getTotalBono() {
        double totalBono = 0.0;

        for (Jugador jugador : jugadores) {
            if (jugador instanceof JugadorActivo) {
                totalBono += ((JugadorActivo) jugador).getBono();
            }
        }

        return totalBono;
    }

    public double getTotal() {
        double total = 0.0;

        for (Jugador jugador : jugadores) {
            if (jugador instanceof JugadorActivo) {
                total += ((JugadorActivo) jugador).getTotal();
            }
        }

        return total;
    }

    public int getTotalH() {
        int totalHombres = 0;

        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }

        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;

        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }

        return totalMujeres;
    }

    public void reporte() {

        System.out.println("Equipo: " + nombre);
        System.out.println("Liga: " + liga);

        System.out.println("\nJugadores:");

        for (Jugador jugador : jugadores) {

            System.out.println("\n" + jugador);

            if (jugador instanceof JugadorActivo) {

                System.out.println("Partidos jugados: " + ((JugadorActivo) jugador).getPartidos());
                System.out.println("Goles anotados: " + ((JugadorActivo) jugador).getGoles());
                System.out.println("Total: " + ((JugadorActivo) jugador).getTotal());
            }
        }

        System.out.println("\nTotales:");
        System.out.println("Total de bonos: " + getTotalBono());
        System.out.println("Total de totales: " + getTotal());
        System.out.println("Total de hombres: " + getTotalH());
        System.out.println("Total de mujeres: " + getTotalM());
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        return liga;

    }

    public void agregarJugador(JugadorActivo jugadorActivo) {
    }
}