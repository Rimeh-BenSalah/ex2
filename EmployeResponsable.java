package ex2;

public class EmployeResponsable extends Employe {
    private double heuresTravaillees;
    private double tarifHoraire;
    public EmployeResponsable(String nom) {
        super(nom);
    }
    public EmployeResponsable(String nom, double heuresTravaillees, double tarifHoraire) {
        super(nom);
        this.heuresTravaillees = heuresTravaillees;
        this.tarifHoraire = tarifHoraire;
    }
    public void setInfosSalaire(double heuresTravaillees, double tarifHoraire) {
    	this.heuresTravaillees = heuresTravaillees;
        this.tarifHoraire = tarifHoraire;
    }
    public double getSalaire() {
        double salaire;
        if (heuresTravaillees <= 39) {
            salaire = heuresTravaillees * tarifHoraire;
        } else {
            salaire = 39 * tarifHoraire + (heuresTravaillees - 39) * tarifHoraire * 1.5;
        }
        return salaire;
    }
}
