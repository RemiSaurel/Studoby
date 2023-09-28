public class MainGraphe {
    public static void main(String[] args) {
        // Création des sommets
        Sommet A = new Sommet("A");
        Sommet B = new Sommet("B");
        Sommet C = new Sommet("C");
        Sommet D = new Sommet("D");

        // Création des arcs orientés
        Arc arc1 = new Arc(A, B);
        Arc arc2 = new Arc(A, C);
        Arc arc3 = new Arc(B, D);
        Arc arc4 = new Arc(C, D);

        // Création du graphe orienté
        GrapheOriente graphe = new GrapheOriente();
        graphe.ajouterSommet(A);
        graphe.ajouterSommet(B);
        graphe.ajouterSommet(C);
        graphe.ajouterSommet(D);

        // Ajout des arcs au graphe
        graphe.ajouterArc(arc1);
        graphe.ajouterArc(arc2);
        graphe.ajouterArc(arc3);
        graphe.ajouterArc(arc4);

        // Test du parcours DFS à partir du sommet A
        System.out.println("Parcours DFS à partir du sommet A : ");
        graphe.parcoursDFS(A);

    }
}
