package tp7;


    abstract class Assiette extends Utensile {
        public Assiette(int annee) {
            super(annee);
        }

		protected abstract double calculerSurface();
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
        public double calculerSurface() {
            return 3.14 * rayon * rayon;
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
        public double calculerSurface() {
            return cote * cote;
        }
        public double calculerValeur() {
            return 5 * super.calculerValeur();
        }
        
    }

    
