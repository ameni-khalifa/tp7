package tp7;

abstract class Utensile {
    private int annee;
    public Utensile(int annee) {
        this.annee = annee;
    }
    public int getAnnee() {
        return annee;
    }
    public double calculerValeur() {
        int age = 2019 - annee;
        if (age < 50) {
            return 0;
        } 
        else {
            return age - 50;
        }
    }
    
}