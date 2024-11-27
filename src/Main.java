import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();
        employé emp1 = new employé(1, "nsiri", "zeineb", "IT", 10);
        employé emp2 = new employé(2, "nsiri", "kawther", "RH", 6);
        employé emp3 = new employé(3, "nsiri2", "kawther2", "RH2", 62);

        DepartementHashSet hashSet = new DepartementHashSet();
        département dep1 = new département(1,"math",3);
        département dep2 = new département(2,"ph",2);
        département dep3 = new département(3,"it",6);
        département dep4 = new département(3,"it",6);


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



        System.out.println(dep1.toString());
        System.out.println(dep2.toString());
        System.out.println(dep3.toString());
        System.out.println(dep4.toString());

        hashSet.ajouterDepartement(dep1);
        hashSet.ajouterDepartement(dep2);
        hashSet.ajouterDepartement(dep3);
        hashSet.ajouterDepartement(dep4);

        hashSet.displayDepartement();

        boolean p1= hashSet.rechercherDepartement("ph");
        System.out.println(p1);
        boolean p2= hashSet.rechercherDepartement(dep1);
        System.out.println(p2);

        System.out.println("TreeSet : " + hashSet.trierDepartementById());

        hashSet.supprimerDepartement(dep3);
        hashSet.displayDepartement();


    }
}
