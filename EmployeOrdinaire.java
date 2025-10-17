package ex2;

public class EmployeOrdinaire extends Employe {
    private double heures;
    private double tauxHoraire;
    public EmployeOrdinaire(String nom) {
        super(nom);
    }
    public EmployeOrdinaire(String nom, double heures, double tauxHoraire) {
        super(nom);
        this.heures = heures;
        this.tauxHoraire = tauxHoraire;
    }
    public void setInfosSalaire(double heures, double tauxHoraire) {
    	this.heures = heures;
        this.tauxHoraire = tauxHoraire;
    }
    public double getSalaire() {
        double salaire;
        if (heures <= 39)
            salaire = heures * tauxHoraire;
        else
            salaire = 39 * tauxHoraire + (heures - 39) * tauxHoraire * 1.3;
        return salaire;
    }
}
