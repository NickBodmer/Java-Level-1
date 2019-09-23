import java.util.Random;
import java.util.Scanner;

public class XO {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static char DOT_EMPTY = '.';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }

        }
    }

    public static void printMap() {

        System.out.print("  ");

        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (chekWin0(DOT_X)) {
                System.out.println("Вы выиграли");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (chekWin0(DOT_O)) {
                System.out.println("Компьютер выиграл");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в фоомате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while ((!isCellValid(x, y)));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static Random rand = new Random();

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while ((!isCellValid(x, y)));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean chekWin0(char symb) {
        boolean rowWin=false;
        boolean colWin=false;
        boolean diagWin=false;
        boolean diagWinInverted=false;

        for(int x=0; x < SIZE ; x++){
            rowWin=true;
            for(int y=0; y < SIZE ; y++){
                if(map[x][y] != symb){
                    rowWin=false;
                }
            }
            if (rowWin) return true;
        }

        for(int x=0; x < SIZE ; x++){
            colWin=true;
            for(int y=0; y < SIZE ; y++){
                if(map[y][x] != symb){
                    colWin=false;
                }
            }
            if (colWin) return true;
        }

        diagWin=true;
        for(int x=0; x < SIZE ; x++){
            if(map[x][x] != symb){
                diagWin=false;
            }
        }

        if(diagWin) return true;

        diagWinInverted=true;
        for(int x=0; x < SIZE ; x++){
            if(map[x][(SIZE-1)-x] != symb){
                diagWinInverted=false;
            }
        }

        if(diagWinInverted) return true;


        return false;


    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;


    }


}
