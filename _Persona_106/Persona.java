package _Persona_106;

import _p101_Persona.Trabajo;

public class Persona {
    protected String Nombre;
    protected String Direccion;
    public Persona(){

    }
    public Persona( String nombre, String direccion) {
        nombre=Nombre;
        direccion=Direccion;
    }
    public Persona(String string, Trabajo trabajo) {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Direccion=" + Direccion ;
    }
    public void setTrabajo(Trabajo trabajo) {
    }
}
