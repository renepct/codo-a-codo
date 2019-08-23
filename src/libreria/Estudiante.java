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
public class Estudiante {
    private String nombre;
    private int edad;
    private char sexo;
    private int nota;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
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

    public Estudiante(String nombre, int edad, char sexo, int nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nota = nota;
    }

    public Estudiante() {
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", nota=" + nota + '}';
    }

    
    
}
