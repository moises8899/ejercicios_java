package muertosyheridos;

import javax.swing.JOptionPane;

public class Muertosyheridos {

    public static void main(String[] args) {
        myh();
    }

    public static void myh() {
        int numero = 0;
        String nusuario;
        numero = (int) (Math.random() * 10000);
        String num = String.valueOf(numero);
        int i = 0;
        int contadorm = 0;
        int contadorh = 0;

        do {
            nusuario = JOptionPane.showInputDialog("Introduce un numero");
            for (i = 0; i < nusuario.length(); i++) {
                if (nusuario.charAt(i) == num.charAt(i)) {
                    contadorm++;
                } else if (num.charAt(i) == nusuario.charAt(0) || num.charAt(i) == nusuario.charAt(1)
                        || num.charAt(i) == nusuario.charAt(2) || num.charAt(i) == nusuario.charAt(3)) {
                    contadorh++;
                }

            }
            System.out.println("Hay " + contadorm + " muertos " + "y" + contadorh + " heridos");
            contadorm = 0;
            contadorh = 0;
            
        } while (contadorm < 4);

    } 

}
