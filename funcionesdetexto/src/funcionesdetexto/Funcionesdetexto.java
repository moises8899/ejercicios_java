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
        //Haz un programa que lea un String y cuente todas sus vocales (mayúsculas o minúsculas, con o sin acento).
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
        // Haz un programa que pida un número de cuenta de veinte dígitos y muestre por pantalla la siguiente información: 
        //Código del Banco, Código de la oficina, Dígitos de control y número de cuenta. Se debe comprobar que haya introducido el número correcto de dígitos.
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
        //Escribe una aplicación con un String que contenga una contraseña cualquiera. 
        //Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes 
        //ya no pedirá más la contraseña y mostrará un mensaje diciendo ?Enhorabuena?

        String pass = JOptionPane.showInputDialog("Introduce una contraseña");
        String cadena = "";
        int intentos = 0;
        while (intentos < 4 && !pass.equals(cadena)) {
            cadena = JOptionPane.showInputDialog("Introduce contraseña: ");
            intentos++;
        }
        if (pass.equals(cadena)) {
            System.out.println("Enhorabuena. Has acertado");
        } else {
            System.out.println("Lo siento vuelve a intentarlo");
        }

    }

   
    public static void diasemana() {
        // Crea un programa que nos pida un día de la semana y que nos diga si es un día laboral o no. 
        // Si el día no se reconoce, mostrar el mensaje ?Día incorrecto?. Usa un switch para ello.
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
