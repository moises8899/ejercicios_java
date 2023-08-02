

package ahorcado;

import javax.swing.JOptionPane;

public class Ahorcado {

    static boolean[] aciertos;
    static String palabra;
    static int numFallos;
    static final int FALLOSP = 8;

    public static void main(String[] args) {
        char letra;
        pedirPalabraSecreta();
        do {
            dibujarPalabra();
            letra = pedirLetra();
            if (!comprobarLetra(letra)) {
                numFallos++;
            }
            System.out.println("Llevas " + numFallos + " fallos");
        } while (!comprobarSolucion() && numFallos <= FALLOSP);
        if (numFallos > FALLOSP) {
            System.out.println("Mala suerte, otra vez será");
        } else {
            System.out.println("Acertaste!!");
        }
        System.out.println("La palabra era " + palabra);

    }

    public static void pedirPalabraSecreta() {
        palabra = JOptionPane.showInputDialog("Introduzca palabra secreta (sin acentos)");
        palabra = palabra.toLowerCase();
        aciertos = new boolean[palabra.length()];
        numFallos = 0;
    }

    public static void dibujarPalabra() {
        for (int i = 0; i < palabra.length(); i++) {
            if (aciertos[i]) {
                System.out.print(palabra.charAt(i));
            } else {
                System.out.print("_");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public static char pedirLetra() {
        String leer;
        char letra;
        int numletra;
        do {
            leer = JOptionPane.showInputDialog("Introduzca UNA letra minúscula");
            letra = leer.charAt(0);
            numletra = letra;
        } while (numletra < 97 || 122 < numletra || leer.length() != 1);
        return letra;
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

    public static boolean comprobarSolucion() {
        for (int i = 0; i < aciertos.length; i++) {
            if (!aciertos[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean comprobarletrano(char c) {
        for(int i=0;i<palabra.length();i++){
            if(palabra.charAt(i)==c) return true;
        }
        
        return false;
        
    }
}
