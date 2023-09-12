public class Personnage {

    private final String nom;
    private int pv;
    private final int deplacement;

    public Personnage(String nom, int pv, int DEPLACEMENT) {
        this.nom = nom;
        this.pv = pv;
        this.deplacement = DEPLACEMENT;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPv() {
        return this.pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void deplacer() {
        System.out.println(this.nom + " se déplace.");
    }

    public int getDeplacement() {
        return this.deplacement;
    }
}