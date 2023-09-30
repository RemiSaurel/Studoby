public class Arc {
    Sommet depart;
    Sommet arrivee;
    int poids;

    public Arc(Sommet depart, Sommet arrivee) {
        this.depart = depart;
        this.arrivee = arrivee;
    }

    public Arc(Sommet depart, Sommet arrivee, int poids) {
        this.depart = depart;
        this.arrivee = arrivee;
        this.poids = poids;
    }

    @Override
    public String toString() {
        return String.valueOf(this.depart) + " -> " + String.valueOf(this.arrivee) + " (" + String.valueOf(this.poids) + ")";
    }
}
