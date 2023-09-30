public class GrapheNonOriente extends Graphe {

    public GrapheNonOriente() {
        super(false); // Graphe non orienté
    }

    @Override
    public void ajouterArc(Sommet depart, Sommet arrivee) {
        Arc arc = new Arc(depart, arrivee);
        depart.ajouterArcSortant(arc);
    }

    @Override
    public void ajouterArc(Sommet depart, Sommet arrivee, int poids) {
        Arc arc = new Arc(depart, arrivee, poids);
        depart.ajouterArcSortant(arc);
    }
}
