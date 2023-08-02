package tresenraya;


/*Vamos a hacer el tipico juego del 3 en raya,donde habrá 2 jugadores que tengan que
      hacer el 3 en raya, los signos seran la X y el 0, cuando haya una posicion vacia
      habrá un -. El tablero de juego será una matriz de 3x3 de tipo char, el juego termina 
      cuando uno de los jugadores hace 3 en raya o no hay más posiciones que rellenar.
      El juego debe pedir las posiciones donde el jugador actual quiera poner su marca,
      esta debe ser validada y por supuesto que no haya una marca puesta.
      Realizarlo de forma modular*/
import java.util.Scanner;
public class Tresenraya {
public static char[][] tablero;
    public static final char SIMBOLO1 = 'X';
    public static final char SIMBOLO2 = 'O';
    public static final char SIMBOLOV = '-';
    public static final int DIMENSION = 4;
    public static int turno;
    public static boolean alterno;
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int fila = 0, columna = 0;
        inicializaPartida();
        do {
            imprimeTablero();
            do {
                if (alterno) {
                    System.out.println("Turno del jugador 1: ");
                    System.out.print("Introduce número de fila para símbolo " + SIMBOLO1 + ": ");
                    fila = entrada.nextInt();
                    System.out.print("Introduce número de columna para símbolo " + SIMBOLO1 + ": ");
                    columna = entrada.nextInt();

                } else {
                    System.out.println("Turno del jugador 2: ");
                    System.out.print("Introduce número de fila para símbolo " + SIMBOLO2 + ": ");
                    fila = entrada.nextInt();
                    System.out.print("Introduce número de columna para símbolo " + SIMBOLO2 + ": ");
                    columna = entrada.nextInt();
                }
            } while (!datosCorrectos(fila, columna));
            escribeDato(alterno, fila, columna);
            turno++;
            alterno = !alterno;

        } while (!comprobar() && turno < (DIMENSION*DIMENSION));
        comprobacionFinal();
    }

    /* Relleno la matriz con el símbolo de vacío y pongo contadores a cero*/
    public static void inicializaPartida() {
        alterno = true;
        turno = 0;
        tablero = new char[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                tablero[i][j] = SIMBOLOV;
            }
        }
    }

    public static boolean comprobar() {
        return comprobarFilas(tablero) || comprobarColumnas(tablero) || comprobarDiagonales(tablero);
    }

    public static void imprimeTablero() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean comprobarFilas(char[][] m) {
        int contador1 = 0, contador2 = 0;
        for (int j = 0; j < DIMENSION; j++) {
            for (int i = 0; i < DIMENSION; i++) {
                if (m[i][j] == SIMBOLO1) {
                    contador1++;
                }
                if (m[i][j] == SIMBOLO2) {
                    contador2++;
                }
            }
            if (contador1 == DIMENSION || contador2 == DIMENSION) {
                return true;
            } else {
                contador1 = 0;
                contador2 = 0;
            }
        }
        return false;
    }

    public static boolean comprobarColumnas(char[][] m) {
        int contador1 = 0, contador2 = 0;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (m[i][j] == SIMBOLO1) {
                    contador1++;
                }
                if (m[i][j] == SIMBOLO2) {
                    contador2++;
                }
            }
            if (contador1 == DIMENSION || contador2 == DIMENSION) {
                return true;
            } else {
                contador1 = 0;
                contador2 = 0;
            }
        }
        return false;
    }

    public static boolean comprobarDiagonales(char[][] m) {
        int contador1 = 0, contador2 = 0;
        for (int i = 0; i < DIMENSION; i++) {
            if (m[i][i] == SIMBOLO1) {
                contador1++;
            }
            if (m[i][i] == SIMBOLO2) {
                contador2++;
            }
        }
        if (contador1 == DIMENSION || contador2 == DIMENSION) {
            return true;
        } else {
            contador1 = 0;
            contador2 = 0;
        }
        for (int i = 0; i < DIMENSION; i++) {
            if (m[i][DIMENSION - 1 - i] == SIMBOLO1) {
                contador1++;
            }
            if (m[i][DIMENSION - 1 - i] == SIMBOLO2) {
                contador2++;
            }
        }
        if (contador1 == DIMENSION || contador2 == DIMENSION) {
            return true;
        }
        return false;
    }

    public static boolean datosCorrectos(int f, int c) {
        if ((f < 1 || f > DIMENSION) || (c < 1 || c > DIMENSION)) {
            System.out.println();
            System.out.println("Fila y columna tienen que estar comprendidos entre 1 y "+DIMENSION);
            return false;
        }
        f--;
        c--;
        if (tablero[f][c] != SIMBOLOV) {
            System.out.println();
            System.out.println("Esa casilla ya está ocupada");
            return false;
        }
        return true;
    }

    public static void escribeDato(boolean njugador, int f, int c) {
        f--;
        c--;
        if (njugador) {
            tablero[f][c] = SIMBOLO1;
        } else {
            tablero[f][c] = SIMBOLO2;
        }
    }

    /*Compruebo por qué razón ha salido del while, si ha ganado alguien o se
    han acabado los turnos. Alterno me indica el ganador.
     */
    public static void comprobacionFinal() {
        if (turno == DIMENSION*DIMENSION) {
            System.out.println("Ha habido empate!!");
        } else if (alterno) {
            System.out.println("Ganador jugador 2!!");
        } else {
            System.out.println("Ganador jugador 1!!");
        }

    }

}    