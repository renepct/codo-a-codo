/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author Rene
 */
public class Profesor {
    
    private String nombre;
    private int edad;
    private char sexo;
    private String asigimparte;

    public String getAsigimparte() {
        return asigimparte;
    }

    public void setAsigimparte(String asigimparte) {
        this.asigimparte = asigimparte;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Profesor(String nombre, int edad, char sexo, String asigimparte) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.asigimparte = asigimparte;
    }

    public Profesor() {
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", asigimparte=" + asigimparte + '}';
    }

    
            
    
  }



