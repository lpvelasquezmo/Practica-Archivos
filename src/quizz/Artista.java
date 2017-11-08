/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Artista extends Usuario {
    private ArrayList <Obra> obras;
    private int NumObras;

    public int getNumObras() {
        return NumObras;
    }

    public void setNumObras(int NumObras) {
        this.NumObras = NumObras;
    }

    public Artista(String usuario, String clave, String nombre, int numero) {
        super(usuario, clave, nombre);
        this.obras= new ArrayList <>();
        this.NumObras = numero;
        
    }

    
    
   public boolean addObra (String name, String esti, String tecn, double valor){
       Obra obra = new Obra (name, esti, tecn, valor);
       boolean aux = this.obras.add(obra);
       return aux;
   } 
   
   public boolean venderO (Obra obra){
      return this.obras.remove(obra);
   }
    
    
}
