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
public class Aula {
    
    private int numaula;
    private int maxestudiante;
    private String auldest;

    public int getNumaula() {
        return numaula;
    }

    public void setNumaula(int numaula) {
        this.numaula = numaula;
    }

    public int getMaxestudiante() {
        return maxestudiante;
    }

    public void setMaxestudiante(int maxestudiante) {
        this.maxestudiante = maxestudiante;
    }

    public String getAuldest() {
        return auldest;
    }

    public void setAuldest(String auldest) {
        this.auldest = auldest;
    }

    public Aula(int numaula, int maxestudiante, String auldest) {
        this.numaula = numaula;
        this.maxestudiante = maxestudiante;
        this.auldest = auldest;
    }

    public Aula() {
    }

    @Override
    public String toString() {
        return "Aula{" + "numaula=" + numaula + ", maxestudiante=" + maxestudiante + ", auldest=" + auldest + '}';
    }
    
    
              
            
    
}
