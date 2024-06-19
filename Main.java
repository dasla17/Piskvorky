package projekty;

public class Main {
    public static void main(String[] args) {

        HraciPlocha hraciPlocha = new HraciPlocha();
        Hrac hrac1 = new Hrac('x');
        Hrac hrac2 = new Hrac('o');
        Hrac aktualniHrac = hrac1;

        while (true) {
            hraciPlocha.vykresliPlochu();
            aktualniHrac.provedTah(hraciPlocha);
            if (hraciPlocha.jeVitez(aktualniHrac.getSymbol())) {
                hraciPlocha.vykresliPlochu();
                System.out.println("Hráč " + aktualniHrac.getSymbol() + " vyhrál!");
                break;
            }
            if (hraciPlocha.jePlno()) {
                hraciPlocha.vykresliPlochu();
                System.out.println("Remíza!");
                break;
            }
            aktualniHrac = (aktualniHrac == hrac1) ? hrac2: hrac1;
        }

    }
}