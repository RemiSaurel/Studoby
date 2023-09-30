public class GrapheOriente extends Graphe {

    public GrapheOriente() {
        super(true); // Graphe orienté
    }

    @Override
    public void ajouterArc(Sommet depart, Sommet arrivee) {
        Arc arc = new Arc(depart, arrivee);
        arrivee.ajouterArcEntrant(arc);
    }

    @Override
    public void ajouterArc(Sommet depart, Sommet arrivee, int poids) {
        Arc arc = new Arc(depart, arrivee, poids);
        arrivee.ajouterArcEntrant(arc);
    }
}