package tp7;
abstract class Ustensile {
    private int annee;
    public Ustensile(int annee) {
        this.annee = annee;
    }
    public int getAnnee() {
        return annee;
    }
    abstract class Assiette extends Ustensile {
        public Assiette(int annee) {
            super(annee);
        }
    }
    class Assietteronde extends Assiette {
        private double rayon;
        
        
        public Assietteronde(int annee, double rayon) {
            super(annee);
            this.rayon = rayon;
        }

        public double getRayon() {
            return rayon;
        }
    }
    class Assiettecarree extends Assiette{
    	private double cote;
        public Assiettecarree(int annee, double cote) {
            super(annee);
            this.cote = cote;
        }

        public double getcote() {
            return cote;
        }
        }
    }

    
}