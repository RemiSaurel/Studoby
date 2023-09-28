import java.util.ArrayList;
import java.util.List;

public class Sommet {

    String nom;
    List<Arc> arcsSortants;

    public Sommet(String nom) {
        this.nom = nom;
        this.arcsSortants = new ArrayList<>();
    }

    public void ajouterArcSortant(Arc arc) {
        this.arcsSortants.add(arc);
    }

    @Override
    public String toString() {
        return String.valueOf(this.nom);
    }

}
