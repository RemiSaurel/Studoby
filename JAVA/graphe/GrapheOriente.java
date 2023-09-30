public class GrapheOriente extends Graphe {

    public GrapheOriente() {
        super(true); // Graphe orienté
    }

    @Override
    public void ajouterArc(Arc a) {
        a.arrivee.ajouterArcEntrant(a);
        a.depart.ajouterArcSortant(a);
    }
}