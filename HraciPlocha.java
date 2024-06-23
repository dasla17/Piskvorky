package projekty;

public class HraciPlocha {

    /**
     * hrací plocha
     */
    private char [][] hraciPlocha;

    /**
     * konstruktor
     */
    public HraciPlocha() {
        hraciPlocha = new char[3][3];
        inicializujPlochu();
    }

    /**
     * inicializace hrací plochy
     */
    private void inicializujPlochu() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hraciPlocha[i][j] = '-';
            }
        }
    }

    /**
     * vykreslení hrací plochy
     */
    public void vykresliPlochu() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(("| "));
            for (int j = 0; j < 3; j++) {
                System.out.print(hraciPlocha[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    /**
     * kontrola obsazenosti pole
     * @return
     */
    public boolean jePlno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (hraciPlocha[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean jeVitez (char symbol) {
        /**
         * kontrola řádků
         */
        for (int i = 0; i < 3; i++) {
            if (hraciPlocha[i][0] == symbol && hraciPlocha[i][1] == symbol && hraciPlocha[i][2] == symbol) {
                return true;
            }
        }
        /**
         * kontrola sloupců
          */

        for (int i = 0; i < 3; i++) {
            if (hraciPlocha[0][i] == symbol && hraciPlocha[1][i] == symbol && hraciPlocha[2][i] == symbol) {
                return true;
            }
        }
        /**
         * kontrola diagonál
         */
        if (hraciPlocha[0][0] == symbol && hraciPlocha[1][1] == symbol && hraciPlocha[2][2] == symbol) {
            return true;
        }
        if (hraciPlocha[0][2] == symbol && hraciPlocha[1][1] == symbol && hraciPlocha[2][0] == symbol) {
            return true;
        }
        return false;
    }

    /**
     * provedení tahu
     * @param row
     * @param col
     * @param symbol
     * @return
     */
    public boolean provedTah (int row, int col, char symbol) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && hraciPlocha[row][col] == '-') {
            hraciPlocha[row][col] = symbol;
            return true;
        }
        return false;
    }

}
