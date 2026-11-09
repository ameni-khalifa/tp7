package tp7;

abstract class cuillere extends Utensile {
	  private double lang;
      public cuillere(int annee, double lang) {
          super(annee);
          this.lang=lang;
      }
      public double getlang() {
          return lang;
      }
}