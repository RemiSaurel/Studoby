import java.util.HashSet;
import java.util.Set;

public class Sommet {
    String nom;
    Set<Arc> arcsSortants;
    Set<Arc> arcsEntrants;

    public Sommet(String nom) {
        this.nom = nom;
        this.arcsSortants = new HashSet<>();
        this.arcsEntrants = new HashSet<>();
    }

    public void ajouterArcSortant(Arc arc) {
        this.arcsSortants.add(arc);
    }

    @Override
    public String toString() {
        return this.nom;
    }

    public void ajouterArcEntrant(Arc arc) {
        this.arcsEntrants.add(arc);
    }
}
