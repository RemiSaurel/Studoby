public class DPS extends Personnage {
    public DPS(String nom, int pv) {
        super(nom, pv, 3);
    }

    @Override
    public void deplacer() {
        System.out.println(this.getNom() + " se déplace de " + this.getDeplacement() + " cases.");
    }

    public void attaquer(Personnage p) {
        System.out.println(this.getNom() + " attaque " + p.getNom() + " !");
        p.setPv(p.getPv() - 10);
        System.out.println(p.getNom() + " a maintenant " + p.getPv() + " PV.");
    }
}
