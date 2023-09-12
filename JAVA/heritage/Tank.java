public class Tank extends Personnage {

    public Tank(String nom, int pv) {
        super(nom, pv,1);
    }

    @Override
    public void deplacer() {
        System.out.println(this.getNom() + " se déplace de " + this.getDeplacement() + " cases.");
    }

    public void renforcer() {
        System.out.println(this.getNom() + " se renforce !");
        this.setPv(this.getPv() + 10);
        System.out.println(this.getNom() + " a maintenant " + this.getPv() + " PV.");
    }
}
