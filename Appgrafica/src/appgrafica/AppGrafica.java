
package appgrafica;

import static appgrafica.Ahorcado1.aciertos;
import static appgrafica.Ahorcado1.numFallos;
import static appgrafica.Ahorcado1.palabra;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class AppGrafica {
    /*static boolean[] aciertos;
    static String palabra;
    static int numFallos;
    static final int FALLOSP = 8;*/
    
    
    public static void main(String[] args) {
        /*Encuesta ventana1=new Encuesta();*/
        /*GeneradorN ventana2=new GeneradorN();*/
        /*ventana1.setVisible(true);*/
        /*ventana2.setVisible(true);*/
        /*ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        /*ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
       
        /* Espejo Ventana3=new Espejo();
        Ventana3.setVisible(true);
        Ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
       
       /*Investiga Ventana4=new Investiga();
       Ventana4.setVisible(true);
       Ventana4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
       
       /*GeneradorN2 Ventana5=new GeneradorN2();
       Ventana5.setVisible(true);
       Ventana5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
       
       /*Memoria Ventana6=new Memoria();
       Ventana6.setVisible(true);
       Ventana6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
       
       Ahorcado1 Ventana7=new Ahorcado1();
       Ventana7.setVisible(true);
       Ventana7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pedirPalabraSecreta();
      iniciarPalabra();
      
    
    
    
    }
    
       public static boolean comprobarLetra(char c) {
        boolean existeLetra = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == c) {
                aciertos[i] = true;
                existeLetra = true;
            }
        }
        return existeLetra;
    } 
       
     public static void pedirPalabraSecreta() {
        palabra = JOptionPane.showInputDialog("Introduzca palabra secreta (sin acentos)");
        palabra = palabra.toLowerCase();
        aciertos = new boolean[palabra.length()];
        numFallos = 0;
    }
     public static void iniciarPalabra() {
        for (int i = 0; i < palabra.length(); i++) {
            if (!aciertos[i]) {
                if (i == 0) {
                    /*jLabel1.setText("_");*/
                }

               
        }

    }
   }
    
}