import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion <employé>{

    private ArrayList<employé> employes = new ArrayList<>();


    @Override
    public void ajouterEmploye(employé employé) {
        employes.add(employé);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        if (employes.contains(nom)){
            return true;
        }else
        {
        return false;
        }
    }

    @Override
    public boolean rechercherEmploye(employé employé) {
        return employes.contains(employé);
    }

    @Override
    public void supprimerEmploye(employé employé) {
        employes.remove(employé);
    }

    @Override
    public void displayEmploye() {
        System.out.println("la liste contient:" + employes);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        System.out.println("hello");
    }
}