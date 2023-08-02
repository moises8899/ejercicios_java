package funcionesbasicasjava;

import java.security.PublicKey;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Funcionesbasicasjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprimedivision();
        //imprimenumeroshastapulsar0();
        //numerosdistintos();
        //cuartodivisor();
        //factorial();
        //sumadivisores2y3();
        //adivinanumero1y10();
        //adivinanumeroaleatorio();
        //cuentadigitos();
        //menu();
        //tablamulti();
        modulos();
    }

    /* public static void notas(){
        String nota=JOptionPane.showInputDialog("Escriba un numero");
        Double n=Double.parseDouble(nota);
        if (n<5){
            System.out.println("Suspenso");

        }else if (n>=5&&n<6){
            System.out.println("Aprobado");
        }else if(n=6){
                    System.out.println("Bien");
                }else if(n>7||<9){
                        System.out.println("Notable");


            }

        else{
            System.out.println("Sobresaliente");
        }
        }
    }
     */
    public static void imprimedivision() {
        String num1 = JOptionPane.showInputDialog("introduce el num dividendo");
        double divid;
        divid = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog("introduce el num divisor");
        double divisor;
        divisor = Integer.parseInt(num2);

        if (divid > divisor) {
            System.out.println(divid / divisor);
        } else {
            System.out.println(divisor / divid);
        }
    }

    public static void imprimenumeroshastapulsar0() {
        boolean salida = false;
        String dato;

        System.out.println("Los números introducidos son:");
        while (salida == false) {
            dato = JOptionPane.showInputDialog("Inserta un numero");
            int num;
            num = Integer.parseInt(dato);
            salida = (num == 0);
            System.out.println(num);

        }

    }

    public static void numerosdistintos() {
        String param1 = JOptionPane.showInputDialog("Inserta el primer numero");
        int num1 = Integer.parseInt(param1);

        String param2 = JOptionPane.showInputDialog("inserta el segundo numero");
        int num2 = Integer.parseInt(param2);

        String param3 = JOptionPane.showInputDialog("introduce el tercer numero");
        int num3 = Integer.parseInt(param3);

        if (num1 > num3 && num1 > num2) {

            System.out.println("El numero 1 es el mayor");

        } else if (num2 > num1 && num2 > num3) {

            System.out.println("El numero 2 es el mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero 3 es el mayor");
        }

        if (num1 < num3 && num1 < num2) {

            System.out.println("El numero 1 es el menor");

        } else if (num2 < num1 && num2 < num3) {

            System.out.println("El numero 2 es el mayor");
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("El numero 3 es el mayor");
        }

    }

    public static void TipodeOperacion() {
        String param1 = JOptionPane.showInputDialog("Introduce un numero");
        int num1 = Integer.parseInt(param1);

        String param2 = JOptionPane.showInputDialog("inserta otro numero");
        int num2 = Integer.parseInt(param2);

        String param3 = JOptionPane.showInputDialog("introduce otro numero");
        int num3 = Integer.parseInt(param3);

        String param4 = JOptionPane.showInputDialog("introduce el ultimo numero");
        int num4 = Integer.parseInt(param4);

        String param5 = JOptionPane.showInputDialog("Introduce la operacion");

        switch (param5) {
            case "+":
                System.out.println(num1 + num2 + num3 + num4);
                break;

            case "-":
                System.out.println(num1 - num2 - num3 - num4);
                break;

        }

    }

    public static void areacirculo() {
        String dato = JOptionPane.showInputDialog("Introducir el radio de la circunferencia");
        double radio = Double.valueOf(dato);
        double area = Math.PI * radio * Math.pow(radio, 2);
        System.out.println("el area del circulo es " + Math.round(area * 100.0) / 100.0);

    }

    public static void cuartodivisor() {
        String dato = JOptionPane.showInputDialog("inserta un numero");
        int num = Integer.parseInt(dato);
        int acudivisores = 2;
        int divisor = 2;
        if (!esprimo(num)) {
            while (acudivisores < 4 && divisor <= num / 2) {
                divisor++;
                if (num % divisor == 0) {
                    acudivisores++;
                }

            }
            if (acudivisores == 3 && divisor > num / 2) {
                acudivisores++;
                divisor = num;
            }
            if (acudivisores == 4) {
                System.out.println("EL cuarto divisor es :" + divisor);

            } else {
                System.out.println("El numero tiene menos de 4 divisores");
            }
        }
    }

    public static boolean esprimo(int numero) {

        boolean primo = true;
        int divisor = 0, acuprimos = 0;
        while (acuprimos < 3 && divisor <= numero / 2) {
            divisor++;
            if (numero % divisor == 0) {
                acuprimos++;
            }
            if (acuprimos > 1) {
                return false;
            }

        }

        return true;

    }

    @SuppressWarnings("empty-statement")
    public static void factorial() {
        String dato = JOptionPane.showInputDialog("introduce un numero");
        double factorial = 1;
        int num = Integer.parseInt(dato);
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        System.out.println("el factorial del numero es" + dato + "es" + factorial);
    }

    /*Escribir un prograna que sume todos los divisores de 2 y de 3 existentes de 1 a 200 
    mostrar ambas sumas*/
    public static void sumadivisores2y3() {

        int acusuma2d = 0;
        int acusuma3d = 0;
        int i;

        String dato = JOptionPane.showInputDialog("Inserta un numero y te daré la suma los divisores 2 y 3");
        int num = Integer.parseInt(dato);
        for (i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                acusuma2d += i;
            }

            if (i % 3 == 0) {
                acusuma3d += i;
            }

        }
        System.out.println("La suma de los divisores de 2 es " + acusuma2d);
        System.out.println("La suma de los divisores de 3 es " + acusuma3d);
    }

    /*Haz un programa que pida un numero entre 1 y 10 se tratade que el usuario vaya probando 
    a introducir un nº hasta acertar con un máximo de 4 intentos, al terminar deberá mostrar 
    el nº secreto*/
    public static void adivinanumero1y10() {

        String dato;
        int num, num2, intentos = 0;

        do {
            dato = JOptionPane.showInputDialog("introduce un numero entre 1 y 10");
            num = Integer.parseInt(dato);
        } while (num < 1 || num > 10);
        do {
            dato = JOptionPane.showInputDialog("Adivina el numero");
            num2 = Integer.parseInt(dato);
            intentos++;

        } while (intentos < 4 && num != num2);

        if (num == num2) {
            System.out.println("Has adivinado el numero:" + num + "en" + intentos + "intentos");
        } else {
            System.out.println("No has adivinado el numero:" + num + "en" + intentos + "intentos");
        }

    }

    public static void adivinanumeroaleatorio() {
        String dato;
        int numt;
        int intentos = 0;
        int aleatorio;
        do {
            dato = JOptionPane.showInputDialog("Introduce un numero");
            numt = Integer.parseInt(dato);
            aleatorio = (int) (Math.random() * 20 + 1);
            intentos++;
        } while (numt != aleatorio);

        System.out.println("Has adivinado el numero:" + aleatorio + "en" + intentos + "intentos");

    }

    /*introducir un numero por teclado un numero y contar sus cifras*/
    public static void cuentadigitos() {
        String dato = JOptionPane.showInputDialog("Introduce un numero");
        int num = Integer.parseInt(dato);
        int digitos = 0;
        while (num != 0) {
            num = num / 10;
            digitos++;
        }
        System.out.println("El numero de digitos es " + digitos);

    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("[1] Cubo de un numero");
        System.out.println("[2] Numero par o impar");
        System.out.println("[3] Salir");
        System.out.println("Introduce una opción(1-3)");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Introduzca un numero");
                double num1 = entrada.nextDouble();
                System.out.println(num1 + "^3 = " + Math.pow(num1, 3));
            }

            case 2 -> {
                System.out.print("Introduzca un numero entero");
                int num2 = entrada.nextInt();
                if (num2 % 2 == 0) {
                    System.out.println("El numero introducido es par");
                } else {
                    System.out.println("El numero introducido es impar");
                }
                ;
            }

        }

    }

    public static void tablamulti() {
        Scanner entrada = new Scanner(System.in);
        int num, i, j;

        do {
            System.out.print("Introduzca un numero del 1 al 10: ");
            num = entrada.nextInt();
        } while (num < 1 || num > 10);
        {
            for (i = 1; i <= num; i++) {
                System.out.println("tabla del..." + i);
                for (j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + i * j);

                }
            }

        }
    }

    public static void modulos() {
        /*
        Diseña un programa Java que pida 3 datos: el numero de alumnos matriculados en programación, numero de alumnos matriculados
        en entorno de desarollo y numero matriculados en BBDD. El programa debera mostrar el % de alumnos de  cada módulo.
        Se supone que un alumno solo puede estar matriculado en un modulo
         */
        Scanner entrada = new Scanner(System.in);
        int mod1, mod2, mod3;

        System.out.println("Introduzca el nº de alumnos en Programación");
        mod1 = entrada.nextInt();
        System.out.println("Introduzca el nº de alumnos en Desarrollo");
        mod2 = entrada.nextInt();
        System.out.println("Introduzca el nº de alumnos en Bases de datos");
        mod3 = entrada.nextInt();

        System.out.println("");

        System.out.println("El porcentaje de alumnos del modulo de programación es: " + Math.round((double) mod1 / (mod1 + mod2 + mod3) * 1000.0) / 10.0 + " % ");
        System.out.println("El porcentaje de alumnos del modulo de desarrollo: " + Math.round((double) mod2 / (mod1 + mod2 + mod3) * 1000.0) / 10.0 + "  % ");
        System.out.println("El porcentaje de alumnos del modulo de BBDD es : " + Math.round((double) mod3 / (mod1 + mod2 + mod3) * 1000.0) / 10.0 + " % ");

    }

}
