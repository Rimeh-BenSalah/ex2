package ex2;

public class Commercial extends Employe {
    private double salaireFixe;
    private double chiffreAffaire;
    public Commercial(String nom) {
        super(nom);
    }
    public Commercial(String nom, double salaireFixe, double chiffreAffaire) {
        super(nom);
        this.salaireFixe = salaireFixe;
        this.chiffreAffaire = chiffreAffaire;
    }
    public void setInfosSalaire(double salaireFixe, double chiffreAffaire) {
    	 this.salaireFixe = salaireFixe;
         this.chiffreAffaire = chiffreAffaire;
    }
    public double getSalaire() {
        return salaireFixe + 0.01 * chiffreAffaire;
    }
}
