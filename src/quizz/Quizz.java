/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ESTUDIANTE
 */
public class Quizz {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        File artistas = new File ("artistas.txt");
        String no = "";
                String estilo = "";
                String tecnica = "";
                double precio = 0;
                
//        ArrayList<Artista> arr = new ArrayList<>();
//        
//        for( Artista x : arr ) { // for( int i = 0; i < arr.size(); i++ )
//            Artista x = arr.get(i);
//            arr.add(Artista);
//            for( Obra y : x.obras ) {
//                if( y.nombre.equals("papito")) {
//                    System.out.println(x);
//                } 
//            }
//        }
                
        Scanner sc = new Scanner( new FileInputStream(artistas) );
        
        while( sc.hasNextLine() ) {
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer( line, "," );
            String artista = st.nextToken();
            int obras = Integer.parseInt(st.nextToken().trim());
            for( int i = 0; i < obras; ++i ) {
                line = sc.nextLine();
                st = new StringTokenizer( line, "," );
                 no = st.nextToken();
                 estilo = st.nextToken();
                tecnica = st.nextToken();
                 precio = Double.parseDouble(st.nextToken());
                Obra obra = new Obra (no, estilo, tecnica, precio);
            }
         Artista artista1 = new Artista ( "erty", "1234", artista, obras);
         artista1.addObra(no, estilo, tecnica,precio);
         System.out.println("art"  + artista1.getClave() + " " +artista1.getNombre() + " "+ artista1.getNumObras() );
        }
        
        
        double cue =1345;
        double sum = 0;
         webGallery ga = new webGallery (cue); 
              
                      Scanner sis = new Scanner (new File("artistas.txt"));
        System.out.println("ndmf");
               while(sis.hasNext()){
                
              sis.useDelimiter(",");
              String name = sis.nextLine();
              
              while (sis.hasNextDouble()){
                    sum +=sis.nextDouble();
                }
              
              
           
                       //sis.nextLine().split(",");
               System.out.println("na" + name);
               }
      
               
        

// TODO code application logic here
    }
    
}
