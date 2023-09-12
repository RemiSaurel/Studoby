public class Main {
    public static void main(String[] args) {
        Support soraka = new Support("Soraka", 100, 3);
        Personnage alistar = new Support("Alistar", 100, 2);
        Tank braum = new Tank("Braum", 200);
        DPS ashe = new DPS("Ashe", 100);
        DPS caitlyn = new Distance("Caitlyn", 100, 5);

        Personnage[] personnages = {soraka, alistar, braum, ashe, caitlyn};

        for (Personnage p : personnages) {
            p.deplacer();
        }

        ashe.attaquer(braum);
        braum.renforcer();
        soraka.soigner(braum);
        caitlyn.attaquer(braum);
    }
}