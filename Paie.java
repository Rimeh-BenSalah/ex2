package ex2;

public class Paie {
    public static void main(String[] args) {
    	Employe[] employes = new Employe[4];
    	Employe emp1 = new Commercial("salah", 2000, 50000);
        Employe emp2 = new EmployeOrdinaire("mohamed", 45, 20);
        Employe emp3 = new EmployeResponsable("sara", 50, 30);
        Employe emp4 = new Employe("rim");
        employes[0] = emp1;
        employes[1] = emp2;
        employes[2] = emp3;
        employes[3] = emp4;
        System.out.println("Liste des salaires hebdomadaires");
        for (Employe e : employes) {
            System.out.println(e.getNom() + " gagne " + e.getSalaire() + " D");
        }
    }
}