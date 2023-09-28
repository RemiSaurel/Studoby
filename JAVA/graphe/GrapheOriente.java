import java.util.*;

class GrapheOriente {
    List<Sommet> sommets;
    List<Arc> arcs;

    public GrapheOriente() {
        sommets = new ArrayList<>();
        arcs = new ArrayList<>();
    }

    public void ajouterSommet(Sommet sommet) {
        sommets.add(sommet);
    }

    public void ajouterArc(Arc arc) {
        arcs.add(arc);
        arc.depart.ajouterArcSortant(arc);
    }

    // Parcours du graphe en utilisant DFS ->  Depth First Search (parcours en profondeur)
    public void parcoursDFS(Sommet sommetDeDepart) {
        Set<Sommet> visite = new HashSet<>();
        Stack<Sommet> pile = new Stack<>();
        pile.push(sommetDeDepart);

        while (!pile.isEmpty()) {
            Sommet sommetCourant = pile.pop();

            if (!visite.contains(sommetCourant)) {
                System.out.print(sommetCourant + " ");
                visite.add(sommetCourant);

                for (Arc arc : sommetCourant.arcsSortants) {
                    Sommet voisin = arc.arrivee;
                    if (!visite.contains(voisin)) {
                        pile.push(voisin);
                    }
                }
            }
        }
    }
}