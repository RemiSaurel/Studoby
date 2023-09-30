import java.util.ArrayList;
import java.util.List;

public abstract class Graphe {

    protected List<Sommet> sommets;
    protected boolean oriente;

    public Graphe(boolean oriente) {
        sommets = new ArrayList<>();
        this.oriente = oriente;
    }

    public void ajouterSommet(Sommet sommet) {
        sommets.add(sommet);
    }

    public abstract void ajouterArc(Sommet depart, Sommet arrivee);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sommet sommet : sommets) {
            sb.append(sommet).append(" : ");
            if (oriente) {
                for (Arc arc : sommet.arcsSortants) {
                    sb.append(arc.arrivee).append(" ");
                }
            } else {
                for (Arc arc : sommet.arcsEntrants) {
                    sb.append(arc.depart).append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public abstract void ajouterArc(Sommet depart, Sommet arrivee, int poids);
}