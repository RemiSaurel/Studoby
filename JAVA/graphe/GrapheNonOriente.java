public class GrapheNonOriente extends Graphe {

    public GrapheNonOriente() {
        super(false); // Graphe non orienté
    }

    @Override
    public void ajouterArc(Arc a) {
        System.out.println("Ajout de l'arc " + a);
        a.depart.ajouterArcSortant(a);
    }
}
