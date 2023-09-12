public class Distance extends DPS {
    private int range;
    public Distance(String nom, int pv, int range) {
        super(nom, pv);
        this.range = range;
    }

    @Override
    public void deplacer() {
        super.deplacer();
        // En plus de se déplacer de manière classique, le range peut scouter la zone sur sa range disponible.
        System.out.println(this.getNom() + " scoute la zone sur " + this.range + " cases.");
    }
}
