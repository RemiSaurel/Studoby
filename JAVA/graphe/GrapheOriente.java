import java.util.*;

class GrapheOriente {
    List<Sommet> sommets;
    List<Arc> arcs;

    public GrapheOriente() {
        sommets = new ArrayList<>();
        arcs = new ArrayList<>();
    }

    // Ajoute un sommet au graphe
    public void ajouterSommet(Sommet sommet) {
        sommets.add(sommet);
    }

    // Ajoute un arc au graphe
    public void ajouterArc(Arc arc) {
        // On ajoute l'arc à la liste des arcs du graphe
        arcs.add(arc);
        // On ajoute l'arc à la liste des arcs sortants du sommet de départ
        arc.depart.ajouterArcSortant(arc);
    }

    // Parcours du graphe en utilisant DFS ->  Depth First Search (parcours en profondeur)
    public void parcoursDFS(Sommet sommetDeDepart) {
        Set<Sommet> visite = new HashSet<>(); // Un set pour stocker les sommets visités (pour éviter de visiter un sommet plusieurs fois)
        Stack<Sommet> aVisiter = new Stack<>(); // Une pile pour stocker les sommets à visiter (les sommets voisins du sommet courant)
        aVisiter.push(sommetDeDepart); // On commence par le sommet de départ

        while (!aVisiter.isEmpty()) {
            Sommet sommetCourant = aVisiter.pop(); // On récupère le sommet courant

            if (!visite.contains(sommetCourant)) { // Si le sommet courant n'a pas encore été visité
                System.out.print(sommetCourant + " ");
                visite.add(sommetCourant); // On marque le sommet courant comme visité

                for (Arc arc : sommetCourant.arcsSortants) { // On parcourt les arcs sortants du sommet courant
                    Sommet voisin = arc.arrivee; // On récupère le sommet voisin
                    if (!visite.contains(voisin)) { // Si le sommet voisin n'a pas encore été visité
                        aVisiter.push(voisin); // On l'ajoute à la pile pour le visiter plus tard
                    }
                }
            }
        }
    }
}