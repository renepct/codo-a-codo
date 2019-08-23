/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.logging.Logger;

/**
 *
 * @author Rene
 */
public class Libro {
    
    private int isbn;
    private String titulo;
    private String Autor;
    private String Materia;
    private int numPag;


    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getMateria() {
        return Materia;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public Libro(int isbn, String titulo, String Autor, String Materia, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.Autor = Autor;
        this.Materia = Materia;
        this.numPag = numPag;
    }

    public Libro() {
    }

  
    @Override
    public String toString() {
        return "El Libro "+titulo +" con "+ isbn +" creado" + " por "+ Autor + " tiene "+ numPag+ " paginas ";
    }
    


}
