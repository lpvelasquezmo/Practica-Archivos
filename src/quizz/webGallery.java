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
public class webGallery {
    private ArrayList <Comprador> compradores;
    private ArrayList <Artista> artistas;
    private Double CuentaB ;

    public webGallery(Double CuentaB) {
        this.CuentaB = CuentaB;
        this.artistas = new ArrayList<>();
        this.compradores = new ArrayList<>();
        
    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<Comprador> compradores) {
        this.compradores = compradores;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public Double getCuentaB() {
        return CuentaB;
    }

    public void setCuentaB(Double CuentaB) {
        this.CuentaB = CuentaB;
    }
    
     public boolean addartis(String usuario, String clave, String nombre, int nu){
       Artista ar = new Artista (usuario, clave, nombre, nu);
       boolean aux = this.artistas.add(ar);
       return aux;
   } 
    
    
}
