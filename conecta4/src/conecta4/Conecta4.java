package conecta4;

import java.util.Scanner;

public class Conecta4 {
public static char[][] tablero;
    public static final char SIMBOLO1 = 'X';
    public static final char SIMBOLO2 = 'O';
    public static final char SIMBOLOV = '-';
    public static final int FILAS = 6;
    public static final int COLUMNAS = 7;
    public static int turno;
    public static boolean alterno;
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int columna = 0, fila = 0;
        boolean resuelto;
        inicializaPartida();
        do {
            imprimeTablero();
            do {
                if (alterno) {
                    System.out.println("Turno del jugador 1: ");
                    System.out.print("Introduce número de columna para símbolo " + SIMBOLO1 + ": ");
                    columna = entrada.nextInt();

                } else {
                    System.out.println("Turno del jugador 2: ");
                    System.out.print("Introduce número de columna para símbolo " + SIMBOLO2 + ": ");
                    columna = entrada.nextInt();
                }
            } while (!datosCorrectos(columna));
            fila = escribeDato(alterno, columna);
            resuelto = solucion(fila, columna);
            turno++;
            alterno = !alterno;

        } while (!resuelto && turno < (FILAS * COLUMNAS));

        /*Al salir compruebo si se ha resuelto o no, en caso de haberse 
        resuelto invierto la respuesta del jugador puesto que antes de 
        la última comprobación, hemos vuelto a cambiar el turno
        */
        if (resuelto) {
            imprimeTablero();
            if (turno == FILAS * COLUMNAS) {
                System.out.println("No resuelto, EMPATE!!!");
            } else if (alterno) {
                System.out.println("Enhorabuena, jugador 2!!!");
            } else {
                System.out.println("Enhorabuena, jugador 1!!!");
            }
        }
    }

    public static void inicializaPartida() {
        alterno = true;
        turno = 0;
        tablero = new char[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = SIMBOLOV;
            }
        }
    }

    public static void imprimeTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + "   ");
            }
            System.out.println();
        }
    }

    private static boolean datosCorrectos(int c) {
        if ((c < 1 || c > COLUMNAS)) {
            System.out.println();
            System.out.println("El número de columna tienen que estar comprendidos entre 1 y " + COLUMNAS);
            return false;
        }
        c--;
        if (tablero[0][c] != SIMBOLOV) {
            System.out.println();
            System.out.println("Esa casilla ya está ocupada");
            return false;
        }
        return true;

    }

    public static int escribeDato(boolean njugador, int c) {
        int i = FILAS - 1;
        c--;
        while (tablero[i][c] != SIMBOLOV) {
            i--;
        }
        if (njugador) {
            tablero[i][c] = SIMBOLO1;
        } else {
            tablero[i][c] = SIMBOLO2;
        }
        return i + 1;
    }

    public static boolean solucion(int f, int c) {
        return compruebaFila(f) || compruebaColumna(c) || compruebaDiagonal(f, c) || compruebaDiagonalInv(f, c);
    }

    public static boolean compruebaFila(int f) {
        int c = 0;
        int contador = 0;
        f--;
        while (c < 6 && contador < 3) {
            if ((tablero[f][c] == tablero[f][c + 1]) && tablero[f][c] != SIMBOLOV) {
                contador++;
            } else {
                contador = 0;
            }
            c++;
        }
        return contador >= 3;
    }

    public static boolean compruebaColumna(int c) {
        int f = 0;
        int contador = 0;
        c--;
        while (f < 5 && contador < 3) {
            if ((tablero[f][c] == tablero[f + 1][c]) && tablero[f][c] != SIMBOLOV) {
                contador++;
            } else {
                contador = 0;
            }
            f++;
        }
        return contador >= 3;
    }

    public static boolean compruebaDiagonal(int f, int c) {
        int[] origen = buscaOrigen(f, c);
        int fila = origen[0];
        int columna = origen[1];
        int contador = 0;
        //System.out.println(Arrays.toString(origen));
        while (fila < 5 && columna < 6 && contador < 3) {

            if ((tablero[fila][columna] == tablero[fila + 1][columna + 1]) && tablero[fila][columna] != SIMBOLOV) {
                contador++;
            } else {
                contador = 0;
            }
            fila++;
            columna++;
        }
        return contador >= 3;

    }

    public static int[] buscaOrigen(int fila, int columna) {
        int[] origen = new int[2];
        while (fila != 0 && columna != 0) {
            fila--;
            columna--;
        }
        origen[0] = fila;
        origen[1] = columna;
        return origen;

    }

    public static boolean compruebaDiagonalInv(int f, int c) {
        int[] origen = buscaOrigenInv(f, c);
        int fila = origen[0];
        int columna = origen[1];
        int contador = 0;
        //System.out.println(Arrays.toString(origen));
        while (fila < 5 && columna > 0 && contador < 3) {

            if ((tablero[fila][columna] == tablero[fila + 1][columna - 1]) && tablero[fila][columna] != SIMBOLOV) {
                contador++;
            } else {
                contador = 0;
            }
            fila++;
            columna--;
        }
        return contador >= 3;

    }

    public static int[] buscaOrigenInv(int fila, int columna) {
        fila--;
        columna--;
        int[] origen = new int[2];
        while (fila != 0 && columna != 6) {
            fila--;
            columna++;
        }
        origen[0] = fila;
        origen[1] = columna;
        return origen;

    }
}

   


