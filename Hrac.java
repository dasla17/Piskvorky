package projekty;

import java.util.Scanner;

public class Hrac {
    private char symbol;
    Scanner scanner = new Scanner(System.in);

    /**
     * hráč
     * @param symbol
     */
    public Hrac(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    /**
     * provedení tahu
     * @param hraciPlocha
     */
    public void provedTah(HraciPlocha hraciPlocha) {
        int row, col;
        while (true) {
            System.out.println("Hráči " + symbol + ", zadej řádek (0, 1 nebo 2) a sloupec (0, 1 nebo 2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (hraciPlocha.provedTah(row, col, symbol)) {
                break;
            } else {
                System.out.println("Tento tah není platný, zkus to znovu.");
            }
        }
    }
}