package _p104_PuntoCirculo;

public class Circulo{
    private Punto centro;
    private double radio;

    public Circulo() {
    }

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI * radio * radio;
    }
    
    public double getCircunferencia(){
        return 2 * Math.PI * radio;
    }
    
    @Override
    public String toString() {
        return "Circulo [centro=" + centro + ", radio=" + radio + "]";
    }
}