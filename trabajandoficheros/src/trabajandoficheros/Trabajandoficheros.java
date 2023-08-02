package trabajandoficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Trabajandoficheros {

    public static void main(String[] args) {
        //leefichero();
        //arraytsc();
        //escribirfichero();
        //ejercicio1jarchivos();
        //ejercicio2jarchivos();
        e3();

    }

    public static void leefichero() {
        final String nombrefichero = "C:\\prueba.txt";
        try {
            FileReader fichero = new FileReader(nombrefichero);
            String texto = "";
            int caracteres = 0;
            int valor = fichero.read();
            while (valor != -1) {
                if ((char) valor != ' ') {
                    texto = texto + (char) valor;
                }
                valor = fichero.read();
                caracteres++;
            }
            System.out.println(texto);
            System.out.println("numero de caracteres: " + caracteres);
        } catch (IOException e) {
            System.out.println("Fichero no existe o ruta fichero incorrecta" + e);
        }
    }

    public static void arraytsc() {
        final String nombrefichero = "C:\\textosc.txt";
        try {
            FileReader fichero = new FileReader(nombrefichero);
            String texto = "";
            int contadorp = 0;
            String[] palabras;
            int valor = fichero.read();

            while (valor != -1) {
                if ((char) valor == ' ') {
                    contadorp++;
                }
                valor = fichero.read();

            }
            contadorp++;
            System.out.println(contadorp);
            palabras = new String[contadorp];
            for (int i = 0; i < contadorp; i++) {
                palabras[i] = "";
            }
            int posicion = 0;

            fichero = new FileReader(nombrefichero);
            valor = fichero.read();
            while (valor != -1) {
                if ((char) valor == ',') {
                    posicion++;

                } else {
                    palabras[posicion] += (char) valor;
                }
                valor = fichero.read();
            }
            System.out.println(Arrays.toString(palabras));
        } catch (IOException e) {
            System.out.println("Fichero no existe o ruta fichero incorrecta" + e);
        }

    }

    public static void escribirfichero() {
        String ruta = "C:\\Users\\alpe\\Desktop\\escribir.txt";
        String texto = JOptionPane.showInputDialog("Introduce texto a escribir en el archivo");
        try (FileWriter fich = new FileWriter(ruta, true)) {
            File mifichero = new File(ruta);
            /*Esto escribe texto en el fichero que hayamos selccionado en la ruta*/
            fich.write(texto);
            fich.close();
            /*Esto comprueba que se ha escrito lo anterior en el archivo*/
            FileReader fr = new FileReader(ruta);
            int caracter = fr.read();
            while (caracter != -1) {
                System.out.print((char) caracter);
                caracter = fr.read();

            }

        } catch (IOException e) {
            /*Este mensaje aparece si hay algún problema con la escritura del archivo
            (Por lo general rutas mal puestas)*/
            System.out.println("Problema con la lectura/escritura en el fichero" + e);
        }
    }

    public static void ejercicio1jarchivos() {
        /*Ejercicio 1
            Realiza un programa en Java donde introduzcas la ruta de un fichero por teclado y un texto que queramos a escribir en el fichero con JOptionPane.showInputDialog
            Posteriormente, muestra el contenido del fichero.*/

        String camino = JOptionPane.showInputDialog("Introduce la ruta completa del archivo donde guardar el texto");
        String contenido = JOptionPane.showInputDialog("Introduce texto a escribir en el archivo");
        try (FileWriter fich = new FileWriter(camino, true)) {
            File miarchivo = new File(camino);
            fich.write(contenido);
            fich.close();
            FileReader fr = new FileReader(camino);
            int caracter = fr.read();
            while (caracter != -1) {
                System.out.print((char) caracter);
                caracter = fr.read();

            }

        } catch (Exception e) {
            System.out.println("Problema con la lectura/escritura en el fichero" + e);
        }

    }

    public static void ejercicio2jarchivos() {
        /*Ejercicio 2
        Realiza un programa en Java donde introduzcas la ruta de un fichero y te indique si el fichero existe o no. 
        Si existiera, mostrar el número de caracteres y el número de palabras del fichero.*/

        /*ruta a insertar por teclado*/
        String rutaUsuario = JOptionPane.showInputDialog("Introduzca una ruta a comprobar");
        /*ruta donde se encuentra el archivo*/
        String ruta = "C:\\Users\\alpe\\Desktop\\escribir.txt";
        int contadorc = 0;
        try {
            /*Comprueba que el archivo existe y que la ruta es correcta*/
            if (ruta.toLowerCase().equals(rutaUsuario.toLowerCase())) {
                System.out.println("El archivo exsiste");
                FileReader fr = new FileReader(ruta);
                int caracter = fr.read();
                /*Si la ruta es correcta y el archivo existe 
                cuenta los caracteres que hay dentro del mismo*/
                while (caracter != -1) {
                    contadorc++;
                   
                    caracter = fr.read();
                } 
                System.out.println(contadorc);
                /*Si el archivo no existe o la ruta es incorrecta
                aparecerá el siguiente mensaje*/
            } else {
                System.out.println("El archivo NO existe");
            }

        
        } catch (IOException ex) {
            
        System.out.println("Problema con la lectura/escritura en el fichero");}
    }

    public static void e3() {
        /*Ejercicio 3
    Crea una aplicación que pida la ruta de dos ficheros de texto y de una ruta de destino (solo la ruta, sin fichero al final). 
    Debes copiar el contenido de los dos ficheros en uno, este tendrá el nombre de los dos ficheros separados por un guion bajo, 
    este se guardará en la ruta donde le hayamos indicado por teclado.
    Para unir los ficheros en uno, crea un método donde le pases como parámetro todas las rutas. En este método, aparte de copiar 
    debe comprobar que, si existe el fichero de destino, nos muestre un mensaje informándonos de si queremos sobrescribir el fichero. 
    Te recomiendo usar la clase File y JOptionPane.Por ejemplo, si tengo un fichero A.txt con «ABC» como contenido, un fichero B.txt 
    con «DEF» y una ruta de destino D:\, el resultado será un fichero llamado A_B.txt en la ruta D:\ con el contenido «ABCDEF».
    Puedes crear submétodos para realizar la copia de ficheros, piensa también como podrias optimizar esta copia, 
    si los ficheros tuvieran mucho contenido.
    Recuerda que debes controlar las excepciones que puedan aparecer. En caso de error, mostrar una ventana de dialogo con información del error.*/

        String ruta1 = JOptionPane.showInputDialog("Introduce la ruta del primer archivo");
        String ruta2 = JOptionPane.showInputDialog("Introduce la ruta del segundo archivo");
        String rutaDestino =JOptionPane.showInputDialog("Introduce la ruta del archivo de destino");
        String nombreNuevo=rutaDestino+construyeNombre(ruta1,ruta2);

       
    }
    public static String construyeNombre(String r1,String r2) {
        int barrar1,puntor1,barrar2,puntor2;
        barrar1=r1.lastIndexOf("\\")+1;
        barrar2=r2.lastIndexOf("\\")+1;
        puntor1=r1.lastIndexOf(".");
        puntor2=r2.lastIndexOf(".");
        return r1.substring(barrar1,puntor1)+"_"+r2.substring(barrar2,puntor2)+".txt";
        
    }
    
    public static String nombreNuevo(String r1,String r2) {
        
        return r1;
        
    }

}



















