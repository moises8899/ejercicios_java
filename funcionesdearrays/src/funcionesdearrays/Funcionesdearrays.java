package funcionesdearrays;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Funcionesdearrays {

    public static void main(String[] args) {
        //nrand10();
        //notas();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4()
        //Ejercicio5();
        //Ejercicio6();
        //ejemplo1();
        //doblearraypr();
        //tablax10abi();
        //notasalumnosab();
        //temperaturasab();
        //matriznxn();
        //matrizteclado();
        //matrix4x4();
        //matrixnorepetida()
        //tablasuma10x10();
        //copiar2tablasorden();
        //mtridmimensional();
        //mayorColumnaPrimero();
       

    }

    public static void nrand10() {
        double aleatorios[];
        aleatorios = new double[10];

        for (int i = 0; i < 10; i++) {
            aleatorios[i] = (int) (Math.random() * 100 + 1);

            System.out.println(aleatorios[i]);

        }
    }

    public static void notas() {
        int j = 0;
        String names = "";
        float[] Notas = {5.8f, 6.2f, 7.1f, 5.9f, 3.6f, 9.9f, 1.2f, 10.0f, 4.6f, 5.0f};
        String[] Nombres = new String[10];
        Nombres[0] = "Pedro";
        Nombres[1] = "Ana";
        Nombres[2] = "Luis";
        Nombres[3] = "Luis";
        Nombres[4] = "Juan";
        Nombres[5] = "Eva";
        Nombres[6] = "Mari";
        Nombres[7] = "Fran";
        Nombres[8] = "Luz";
        Nombres[9] = "Sol";
        for (int i = 0; i < Nombres.length; i++) {
            System.out.println(Nombres[i] + " : " + Notas[i]);

            if (Notas[i] >= 5) {
                j++;
                names = Nombres[j];
            }
        }

        System.out.println(" ");
        System.out.println("Aprobados: " + j);
        System.out.println("Aprobados: " + names);
    }

    public static void Ejercicio2() {
        /*
        Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
         */
        int i;
        int suma = 0;
        int numeros[] = new int[100];
        for (i = 0; i < 100; i++) {
            numeros[i] = i + 1;

            suma = suma + numeros[i];

        }
        System.out.println("La suma es : " + suma + " Y el promedio es: " + suma / 100);
    }

    public static void Ejercicio3() {
        /*
    Escribe una función que pida una frase, la convierta en una matriz de char y 
    luego imprima esa matriz de char desde el final hacia el principio.
         */
        int i;
        int j;
        String dato = JOptionPane.showInputDialog("introduce una frase");
        char[] palabra = new char[dato.length()];
        for (i = 0; i == palabra.length - 1; i++) {
            palabra[i] = dato.charAt(i);
        }
        for (j = palabra.length - 1; j >= 0; j--) {

            palabra[j] = dato.charAt(j);
            System.out.print(palabra[j]);

        }

    }

    public static void Ejercicio4() {
        /* Pedir un número de alumnos y a partir de ahí pedir también nombre y nota de cada uno de ellos, almacenando cada lista en una matriz distinta. 
        Una vez leídos los datos los mostrará de la forma: El alumno nombre ha sacado un nota*/
        String dato = JOptionPane.showInputDialog("Introduzca el numero de alumnos");
        int na = Integer.parseInt(dato);
        int nota;
        String alumnos[] = new String[na];
        float notas[] = new float[na];

        for (int i = 0; i < alumnos.length; i++) {
            dato = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
            alumnos[i] = dato;

        }

        for (int i = 0; i < notas.length; i++) {
            dato = JOptionPane.showInputDialog("Introduce una nota");
            nota = Integer.parseInt(dato);
            notas[i] = nota;

        }
        for (int i = 0; i < na; i++) {
            System.out.println("El alumno " + alumnos[i] + " Ha sacado un " + notas[i]);

        }
    }

    public static void Ejercicio5() {
        /*Crea una aplicación que pida un numero por teclado y después comprobaremos si el numero    
        introducido es capicúa, es decir, que se lee igual sin importar la dirección. Por ejemplo, si introducimos 
        30303 es capicúa, si introducimos 30430 no es capicúa*/

        String numero = JOptionPane.showInputDialog("Introduce un numero");
        boolean capicua = true;
        int i = 0, j = numero.length() - 1;
        while (capicua && i < j) {
            if (numero.charAt(i) != numero.charAt(j)) {
                capicua = false;
            }
            i++;
            j--;

        }
        if (capicua == true) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }

    }

    public static void Ejercicio6() {
        /*Haz un programa que lea una frase por teclado y una vocal, y diga cuantas veces aparece 
        dicha letra en la frase introducida*/
        String palabra = JOptionPane.showInputDialog("introduzca una frase");
        String vocal = JOptionPane.showInputDialog("Introduzca una vocal");
        int acu = 0;
        for (int v = 0; v < palabra.length(); v++) {
            if (palabra.charAt(v) == vocal.charAt(0)) {
                acu++;
            }

        }
        System.out.println("La frase " + palabra + " Contiene " + acu + " veces la vocal " + vocal);
    }

    public static void Ejercicio7() {
        /*Escribe un programa que pida un tamaño de array y lo genere automáticamente. 
        Luego pedirá otro número al usuario y lo sustituya por un cero en todo el array.
        El programa debe mostrar por pantalla el valor borrado, el número de veces que aparece ese valor,
        el array inicial y el array final.*/
    }

    /*Escribe un programa que pida 10 numeros por teclado, los almacene en un array y que luego 
      muestre el máximo valor, el mínimo y las posiciones que ambos valores ocupan en el array*/
    @SuppressWarnings("empty-statement")
    public static void ejemplo1() {
        int i;
        int max = 0;
        int min = 20;
        int aleatorios10[];
        aleatorios10 = new int[20];
        for (i = 0; i < aleatorios10.length; i++) {

            aleatorios10[i] = (int) (Math.random() * 10 + 1);
            if (aleatorios10[i] <= min) {
                min = aleatorios10[i];
            }
            if (aleatorios10[i] >= max) {
                max = aleatorios10[i];
            }

        }

        System.out.println("El array es ");
        System.out.println(Arrays.toString(aleatorios10));
        System.out.print("El máximo es " + max + " Y ocupa la posicion ");
        for (i = 0; i < 20; i++) {
            if (aleatorios10[i] == max) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println("");
        System.out.print("El minimo es " + min + " Y ocupa la posicion ");
        for (i = 0; i < 20; i++) {
            if (aleatorios10[i] == min) {
                System.out.print((i + 1) + " ");
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

    /*array bidimensional tabla multiplicar del 1 al 10*/
    public static void tablax10abi() {
        int[][] dualdmatrix = new int[10][10];
        int i, j;

        for (i = 0; i < 10; i++) {

            for (j = 0; j < 10; j++) {
                dualdmatrix[i][j] = (i + 1) * (j + 1);
                System.out.printf("%3d", dualdmatrix[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }

    }

    public static void notasalumnosab() {
        /*Programa que cree una matriz de diez filas y dos columnas de la siguiente forma:
    Los nombres de los alumnos se le pedirán al usuario y las notas se generarán aleatoriamente 
    entre 0 y 10. Una vez rellenada la matriz se mostrarán los datos, un alumno en cada línea.*/
        int i = 0;
        int nota = 0;

        String alumnosn[][] = new String[10][2];
        for (i = 0; i < 10; i++) {
            alumnosn[i][0] = JOptionPane.showInputDialog("Nombre del alumno");
            nota = (int) (Math.random() * 10 + 1);
            alumnosn[i][1] = String.valueOf(nota);
            System.out.println(alumnosn[i][0] + " " + alumnosn[i][1]);
        }

    }

    public static void temperaturasab() {
        /*Crea una función que rellene una matriz de 12x30 con las temperaturas de Alpelandia. Se rellenará con doubles 
    con valores entre 0 y 35. Una vez hecho esto se pedirá un número de mes al usuario y mostrará las temperaturas 
    de ese mes.*/
        int i = 0, j = 0;
        int mes;
        double temps[][] = new double[12][30];
        int dia = 0;
        String dato;
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 30; j++) {
                temps[i][j] = Math.random() * 35;

            }
        }
        dato = JOptionPane.showInputDialog("Introduce el numero del mes");
        mes = Integer.parseInt(dato);
        System.out.println("Las temperaturas del mes " + mes + " son: ");
        for (i = 0; i < 30; i++) {
            dia++;
            System.out.printf("Dia " + dia + " " + "%6.2f%n", temps[mes - 1][i]);
        }

    }

    public static void matriznxn() {
        /*Crear automáticamente dos matrices de nxn (n lo introduce el usuario) y sumar sus valores, 
    los resultados se deben almacenar en otra matriz. Mostrar las matrices originales 
    y el resultado.*/

        int i = 0, j = 0;
        String dato;
        dato = JOptionPane.showInputDialog("Introduzca el tamaño del array");
        int n = Integer.parseInt(dato);
        int moriginal[][] = new int[n][n];
        int moriginal2[][] = new int[n][n];
        int msuma[][] = new int[n][n];

        System.out.println("Los numeros de la matriz 1 son: ");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                moriginal[i][j] = (int) (Math.random() * 10 + 1);
                System.out.printf("%3d", moriginal[i][j]);

            }
            System.out.println();
        }

        System.out.println("Los numeros de la matriz 2 son: ");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                moriginal2[i][j] = (int) (Math.random() * 10 + 1);
                System.out.printf("%3d", moriginal2[i][j]);

            }
            System.out.println();
        }

        System.out.println("La suma de los numeros es: ");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                msuma[i][j] = moriginal[i][j] + moriginal2[i][j];
                System.out.printf("%3d", msuma[i][j]);

            }
            System.out.println();

        }

    }

    public static void matrizteclado() {
        /* Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300 y 
        mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar que se
        introduce un numero entre 0 y 9), estos deben guardarse en un nuevo array.
        Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc.*/

        int i = 0;
        int j = 0;
        String dato = JOptionPane.showInputDialog("Introduce la longitud del array");
        int n = Integer.parseInt(dato);
        String dato2 = JOptionPane.showInputDialog("Introduce la terminacion de los numeros");
        int termino = Integer.parseInt(dato2);
        int matriz1[] = new int[n];
        int acu = 0;

        for (i = 0; i < n; i++) {
            matriz1[i] = (int) (Math.random() * 300 + 1);
            if (termino == matriz1[i] % 10) {
                acu++;
            }

        }
        int[] terminaciones = new int[acu];
        for (j = 0; j < n; j++) {
            if (termino == matriz1[j] % 10) {
                terminaciones[acu - 1] = matriz1[j];
                acu--;
            }
        }
        System.out.println("Matriz original");
        System.out.println(Arrays.toString(matriz1));

    }

    public static void matrix4x4() {
        /*
        Nos piden crear una matriz de 4×4 de números enteros que inicialmente está vacía, 
        nos piden hacer un menú con estas opciones:
    
        ?	Rellenar TODA la matriz de números.
    
        ?	Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
    
        ?	Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
    
        ?	Sumar la diagonal principal (ver ejemplo)
    
        ?	Sumar la diagonal inversa (ver ejemplo)
    
        ?	La media de todos los valores de la matriz
    
        ?	Salir
        
        IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de ejecutar, 
        simplemente mostrar un mensaje donde diga que debes rellenar la matriz.

         */
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int opcion = 0;
        boolean rellenada = false;
        int fila = 0;
        int columna = 0;
        int suma = 0;
        int acu = 0;
        double media = 0;

        while (opcion != 7) {
            System.out.println("Elige una opcion");
            System.out.println("1. rellenar matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Media de la matriz");
            System.out.println("7. Salir");
            System.out.println("Opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            matriz[i][j] = (int) (Math.random() * 100 + 1);
                        }
                    }
                    rellenada = true;
                    System.out.println(Arrays.deepToString(matriz));
                }
                case 2 -> {
                    if (!rellenada) {
                        System.out.println("primero debe rellenar la matriz");
                    } else {
                        System.out.println("Introduce fila a sumar: ");
                        fila = entrada.nextInt() - 1;
                        suma = 0;
                        for (int i = 0; i < 4; i++) {
                            suma += matriz[fila][i];
                        }
                        System.out.println("La suma de la fila " + fila + " es: " + suma);
                    }
                }
                case 3 -> {
                    if (!rellenada) {
                        System.out.println("primero debe rellenar la matriz");
                    } else {
                        System.out.println("Introduce columna a sumar: ");
                        columna = entrada.nextInt() - 1;
                        suma = 0;
                        for (int j = 0; j < 4; j++) {
                            suma += matriz[columna][j];
                        }
                        System.out.println("La suma de la columna " + columna + " es: " + suma);
                    }
                }
                case 4 -> {
                    if (!rellenada) {
                        System.out.println("primero debe rellenar la matriz");
                    } else {

                        suma = 0;
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                suma += matriz[i][i] + matriz[1][1] + matriz[2][2] + matriz[3][3];
                            }
                        }
                        System.out.println("La suma diagonal directa es: " + suma);
                    }

                }
                case 5 -> {
                    if (!rellenada) {
                        System.out.println("primero debe rellenar la matriz");
                    } else {

                        suma = 0;
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                suma += matriz[0][3] + matriz[1][2] + matriz[2][1] + matriz[3][0];
                            }
                        }
                        System.out.println("La suma diagonal inversa es: " + suma);
                    }
                }
                case 6 -> {
                    if (!rellenada) {
                        System.out.println("primero debe rellenar la matriz");
                    } else {

                        suma = 0;
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                suma += matriz[i][j];
                                acu++;
                                media = (double) suma / 16;
                            }

                        }
                        System.out.println("La media es: " + media);
                    }
                }

            }
        }
    }

    public static void matrixnorepetida() {
        int[][] matriz = new int[3][3];
        int n;
        int acu = 0;
        int distintos = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n = (int) (Math.random() * 20 + 1);
                acu++;

                if (!comprobararray(matriz, n, distintos)) {
                    matriz[i][j] = n;
                } else {
                    j--;
                }

            }
        }
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("Número de Intentos: " + acu);
    }

    private static boolean comprobararray(int[][] matriz, int n, int distintos) {
        int columna = 0, contador = 0, fila = 0;
        /*Forma no optima*/
 /* for(int i=0;i<3;i++){
           for(int j=0;j<3;i++){
               if (matriz[i][j]==n){
                   return true;
               }else{
                   return false;
               }
               
           }
       }*/

 /*Forma optimizada*/
        while (contador < distintos && fila < 3) {
            columna = 0;
            while (contador < distintos && columna < 3) {
                contador++;
                if (matriz[fila][columna] == n) {
                    return true;
                }
                columna++;
            }
            fila++;
        }

        return false;

    }

    /*crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna*/
    public static void tablasuma10x10() {
        int t[][];
        int sumfila, sumcolum;
        int i, j;
        final int size = 10;
        t = new int[size][size];
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                t[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        System.out.println(Arrays.deepToString(t));
        System.out.println();
        for (i = 0; i < size; i++) {
            sumcolum = 0;
            for (j = 0; j < size; j++) {
                sumcolum = sumcolum + t[i][j];
            }
            System.out.println("columna" + " " + (int) (i + 1) + ":" + "" + sumcolum);
        }
        for (j = 0; j < size; j++) {
            sumfila = 0;
            for (i = 0; i < size; i++) {
                sumfila = sumfila + t[i][j];
            }
            System.out.println("fila" + "" + (int) (j + 1) + ":" + "" + sumfila);
        }

    }

    /*Leer dos series de 10 enteros que estaran ordenados crecientemente.
 Copiar (Fusionar) las 2 tablas en una terecra, de forma que sigan ordenados*/
    public static void copiar2tablasorden() {
        int s1[], s2[], cp[];
        int i, j, k;
        s1 = new int[10];
        s2 = new int[10];
        cp = new int[20];
        for (i = 0; i < 10 - 1; i++) {
            s1[i] = (int) (Math.random() * 50 + 1);
            s2[i] = (int) (Math.random() * 50 + 1);

        }
        System.out.println("Numeros de la serie 1: " + Arrays.toString(s1));
        System.out.println("Numeros de la serie 2: " + Arrays.toString(s2));
        for (i = 0; i < 10; i++) {
            cp[i] = s1[i];
            cp[i + 10] = s2[i];
        }
        System.out.println("Numeros copiados del resto de tablas a la tabla nueva" + Arrays.toString(cp));
        System.out.println("Numeros ordenados por metodo burbuja" + Arrays.toString(ordenmburbuja(cp)));
    }

    public static int[] ordenmburbuja(int[] cp) {
        int aux = 0, contador = 0;
        for (int i = 0; i < cp.length - 1; i++) {
            for (int j = 0; j < cp.length - 1 - i; j++) {
                if (cp[j] > cp[j + 1]) {
                    aux = cp[j];
                    cp[j] = cp[j + 1];
                    cp[j + 1] = aux;
                    contador++;

                }

            }
        }

        return cp;
    }

    public static void mtridmimensional() {

        int i = 0, j = 0, k = 0;
        String dato = JOptionPane.showInputDialog("Introduzca la longitud del array");
        int n = Integer.parseInt(dato);
        int trd[][][] = new int[n][n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    trd[i][j][k] = (int) (Math.random() * 50 + 1);
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(Arrays.deepToString(trd[i]));
        }
    }

    public static void mayorColumnaPrimero() {
        /*Ejercicio 8
        Crea una función llamada mayorColumnaPrimero. Esta función genera un array de enteros de NxM 
        (la N, la M y los valores se introducen por teclado) y muéstrala en pantalla. 
        Luego calcula cual es la columna cuya suma es mayor y por último intercámbiala por la primera 
        columna. 
        (Crea las funciones sumaColumna e intercambiaColumna, piensa qué parámetros necesita cada una 
        y qué devuelven).*/
        int i = 0, j = 0;
        int ntf = 0;
        int ntc = 0;
        String datof = JOptionPane.showInputDialog("Introduzca el numero de filas");
        ntf = Integer.parseInt(datof);
        String datoc = JOptionPane.showInputDialog("Introduzca el numero de columnas");
        ntc = Integer.parseInt(datoc);
        int conjunto[][] = new int[ntf][ntc];
        int sumcolum = 0, mayorcolumna = 0, colmax = 0;

        for (i = 0; i < ntf; i++) {
            sumcolum = 0;
            for (j = 0; j < ntc; j++) {
                conjunto[i][j] = (int) (Math.random() * 10 + 1);
            }

            sumcolum = sumacolumna(conjunto, i);
            if (sumcolum > mayorcolumna) {
                mayorcolumna = sumcolum;
                colmax = i;
            }
        }
        System.out.println(Arrays.deepToString(conjunto));
        System.out.println("La mayor columna es la numero " + (colmax + 1) + " y suma " + mayorcolumna);
        System.out.println("Ahora mostramos la matriz modificada");
        System.out.println(Arrays.deepToString(intercambiocolumna(conjunto, i)));

    }

    public static int sumacolumna(int[][] m, int indice) {
        int suma = 0;
        for (int i = 0; i < m[indice].length; i++) {
            suma += m[indice][i];
        }
        return suma;
    }

    public static int[][] intercambiocolumna(int[][] m, int ncol) {
        int aux;
        for (int i = 0; i < m[ncol].length; i++) {
            aux = m[ncol][i];
            m[0][i] = m[ncol][i];
            m[ncol][i] = aux;
        }

        return m;

    }

    

}
