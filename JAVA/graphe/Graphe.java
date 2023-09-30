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
                List<Sommet> visite = new ArrayList<>();
                for (Arc arc : sommet.arcsSortants) {
                    if (!visite.contains(arc.arrivee)) {
                        sb.append(arc.arrivee).append(" ");
                        visite.add(arc.arrivee);
                    }
                }
                for (Arc arc : sommet.arcsEntrants) {
                    if (!visite.contains(arc.depart)) {
                        sb.append(arc.depart).append(" ");
                        visite.add(arc.depart);
                    }
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public abstract void ajouterArc(Arc a);
}