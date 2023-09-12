public class Support extends Personnage {

        private int nbPotions;

        public Support(String nom, int pv, int nbPotions) {
            // On imagine que le support peut se déplacer plus vite que les autres personnages
            super(nom, pv, 5);
            this.nbPotions = nbPotions;
        }

        public int getNbPotions() {
            return this.nbPotions;
        }

        public void setNbPotions(int nbPotions) {
            this.nbPotions = nbPotions;
        }

        @Override
        public void deplacer() {
            System.out.println(this.getNom() + " se déplace de " + this.getDeplacement() + " cases.");
        }

        public void soigner(Personnage p) {
            if (this.nbPotions > 0) {
                System.out.println(this.getNom() + " soigne " + p.getNom() + " !");
                p.setPv(p.getPv() + 10);
                System.out.println(p.getNom() + " a maintenant " + p.getPv() + " PV.");
                this.nbPotions--;
                System.out.println(this.getNom() + " a maintenant " + this.nbPotions + " potions.");
            }
        }
}