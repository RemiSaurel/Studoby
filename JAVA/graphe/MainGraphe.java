public class Main {
    public static void main(String[] args) {
        // Création des sommets
        Sommet sommet1 = new Sommet(1);
        Sommet sommet2 = new Sommet(2);
        Sommet sommet3 = new Sommet(3);
        Sommet sommet4 = new Sommet(4);

        // Création des arcs orientés
        Arc arc1 = new Arc(sommet1, sommet2);
        Arc arc2 = new Arc(sommet1, sommet3);
        Arc arc3 = new Arc(sommet2, sommet4);
        Arc arc4 = new Arc(sommet3, sommet4);

        // Création du graphe orienté
        GrapheOriente graphe = new GrapheOriente();
        graphe.ajouterSommet(sommet1);
        graphe.ajouterSommet(sommet2);
        graphe.ajouterSommet(sommet3);
        graphe.ajouterSommet(sommet4);

        // Ajout des arcs au graphe
        graphe.ajouterArc(arc1);
        graphe.ajouterArc(arc2);
        graphe.ajouterArc(arc3);
        graphe.ajouterArc(arc4);

        // Test du parcours DFS à partir du sommet 1
        System.out.println("Parcours DFS à partir du sommet 1 : ");
        graphe.parcoursDFS(sommet1);

    }
}
