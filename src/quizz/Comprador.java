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
public class Comprador extends Usuario {
    private String FormadePago;

    public Comprador(String FormadePago, String usuario, String clave, String nombre) {
        super(usuario, clave, nombre);
        this.FormadePago = FormadePago;
    }

    public String getFormadePago() {
        return FormadePago;
    }

    public void setFormadePago(String FormadePago) {
        this.FormadePago = FormadePago;
    }

    public void comprar (){
        System.out.println("comprando...");
    }
   
    
    
    
    
}
