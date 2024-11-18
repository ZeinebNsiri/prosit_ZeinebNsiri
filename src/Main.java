import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        employé emp1 = new employé(1, "nsiri", "zeineb", "IT", 10);
        employé emp2 = new employé(2, "nsiri", "kawther", "RH", 6);
        employé emp3 = new employé(3, "nsiri2", "kawther2", "RH2", 62);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp3);

        societe.displayEmploye();

        boolean res= societe.rechercherEmploye("nsiri");
        System.out.println(res);

        boolean res2 = societe.rechercherEmploye(emp1);
        System.out.println(res2);

        System.out.println("la liste aprés suppression");
        societe.supprimerEmploye(emp3);
        societe.displayEmploye();

        System.out.println("la liste triée");
        societe.trierEmployeParId();
        societe.displayEmploye();


    }
}
