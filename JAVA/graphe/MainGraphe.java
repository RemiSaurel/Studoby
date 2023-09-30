import java.util.List;

public class MainGraphe {
    public static void main(String[] args) {
        // Création de graphes non orientés et orientés
        GrapheNonOriente gno = new GrapheNonOriente();
        GrapheOriente go = new GrapheOriente();

        List<Graphe> graphes = List.of(gno, go); // OK, POLYMORPHISME

        // Création de sommets
        Sommet A = new Sommet("A");
        Sommet B = new Sommet("B");
        Sommet C = new Sommet("C");
        Sommet D = new Sommet("D");

        List<Sommet> sommets = List.of(A, B, C, D);

        // Ajout des sommets aux graphes
        for (Sommet sommet : sommets) {
            gno.ajouterSommet(sommet);
            go.ajouterSommet(sommet);
        }

        // Création d'arcs avec poids
        Arc BA = new Arc(B, A, 2);
        Arc CA = new Arc(C, A, 3);
        Arc BC = new Arc(B, C, 2);
        Arc CB = new Arc(C, B, 1);
        Arc CD = new Arc(C, D,3);

        List<Arc> arcs = List.of(BA, CA, BC, CB, CD);

        // Ajout des arcs aux graphes
        for (Arc arc : arcs) {
            gno.ajouterArc(arc);
            go.ajouterArc(arc);
        }

        // Affichage des sommets
        System.out.println("==========================");
        for (Sommet sommet : sommets) {
            System.out.println("Sommet " + sommet + " :");
            System.out.println("Arcs sortants : " + sommet.arcsSortants);
            System.out.println("Arcs entrants : " + sommet.arcsEntrants);
            System.out.println("-------");
        }

        // Affichage des graphes
        System.out.println("==========================");
        System.out.println("Graphe non orienté :");
        System.out.println(gno);
        System.out.println("==========================");
        System.out.println("Graphe orienté :");
        System.out.println(go);
    }
}
