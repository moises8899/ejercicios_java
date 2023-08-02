package funcionesdetexto;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Alpe
 */
public class Funcionesdetexto {

    public static void main(String[] args) {
        //empezando();
        //cuentavocales();
        //numerocuenta();
        //inversorpalabra();
        //palabrasinespacio();
        //adivinapass();
        diasemana();

    }

    public static void empezando() {
        String palabra = JOptionPane.showInputDialog("Introduce una palabra");
        System.out.println(palabra.length());

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }

    }

    public static void cuentavocales() {
        //Haz un programa que lea un String y cuente todas sus vocales (may�sculas o min�sculas, con o sin acento).
        String palabra = JOptionPane.showInputDialog("Introduce una palabra");
        palabra = palabra.toLowerCase();
        int acu = 0;
        for (int v = 0; v < palabra.length(); v++) {
            if (palabra.charAt(v) == 'a'
                    || palabra.charAt(v) == 'e'
                    || palabra.charAt(v) == 'i'
                    || palabra.charAt(v) == 'o'
                    || palabra.charAt(v) == 'u') {
                acu++;
            }

        }
        System.out.println("La palabra " + palabra + " contiene " + acu + " vocales");

    }

    public static void numerocuenta() {
        // Haz un programa que pida un n�mero de cuenta de veinte d�gitos y muestre por pantalla la siguiente informaci�n: 
        //C�digo del Banco, C�digo de la oficina, D�gitos de control y n�mero de cuenta. Se debe comprobar que haya introducido el n�mero correcto de d�gitos.
        String ncuenta = JOptionPane.showInputDialog("introduce el numero de cuenta(tiene 20 cifras)");
        String codigobanco = "0";
        String codigooficina = "0";
        String codigocontrol = "0";
        String codigoncuenta = "0";

        codigobanco = ncuenta.substring(0, 4);
        codigooficina = ncuenta.substring(4, 8);
        codigocontrol = ncuenta.substring(8, 10);
        codigoncuenta = ncuenta.substring(10, 20);

        System.out.println("Codigo banco " + codigobanco + "Codigo oficina " + codigooficina + "Digito de control " + codigocontrol + "Codigo de la cuenta " + codigoncuenta);
    }

    public static void inversorpalabra() {

        String palabra = JOptionPane.showInputDialog("Introduce una palabra");
        for (int i = palabra.length(); i > 0; i--) {
            System.out.print(palabra.charAt(i - 1));

        }
        System.out.println("");
    }

    public static void palabrasinespacio() {
        //Dada una cadena de texto, mostrarla sin espacios
        String palabra = JOptionPane.showInputDialog("Inserta una cadena de texto");
        System.out.println(palabra.replace(" ", ""));

    }

    public static void adivinapass() {
        //Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. 
        //Despu�s se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes 
        //ya no pedir� m�s la contrase�a y mostrar� un mensaje diciendo ?Enhorabuena?

        String pass = JOptionPane.showInputDialog("Introduce una contrase�a");
        String cadena = "";
        int intentos = 0;
        while (intentos < 4 && !pass.equals(cadena)) {
            cadena = JOptionPane.showInputDialog("Introduce contrase�a: ");
            intentos++;
        }
        if (pass.equals(cadena)) {
            System.out.println("Enhorabuena. Has acertado");
        } else {
            System.out.println("Lo siento vuelve a intentarlo");
        }

    }

   
    public static void diasemana() {
        // Crea un programa que nos pida un d�a de la semana y que nos diga si es un d�a laboral o no. 
        // Si el d�a no se reconoce, mostrar el mensaje ?D�a incorrecto?. Usa un switch para ello.
        String diasemana = JOptionPane.showInputDialog("Introduce el dia de la semana");
        switch (diasemana) {
            case "lunes", "martes", "miercoles", "jueves", "viernes" ->
                System.out.println("Laboral");

            case "sabado", "domingo" ->
                System.out.println("No labroal");
            default ->
                System.out.println("Dia incorrecto");
        }

    }

}
