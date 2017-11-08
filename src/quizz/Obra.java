/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

/**
 *
 * @author ESTUDIANTE
 */
public class Obra {
    
  private String  nombre;
  private String  estilo;
   private String tecnica;
  private Double  valor;

    public Obra(String nombre, String estilo, String tecnica, Double valor) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
   
  
   
}
