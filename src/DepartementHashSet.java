import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDépartement <département> {
    private HashSet<département> departs = new HashSet<>();


    @Override
    public void ajouterDepartement(département département) {
        departs.add(département);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return departs.contains(nom);
    }

    @Override
    public boolean rechercherDepartement(département département) {
        return departs.contains(département);
    }

    @Override
    public void supprimerDepartement(département département) {
        departs.remove(département);
    }

    @Override
    public void displayDepartement() {
        System.out.println("la liste contient:" + departs);
    }

    @Override
    public TreeSet<département> trierDepartementById() {
        TreeSet<département> tree = new TreeSet<département>();
        for (département dep : departs){
            tree.add(dep);
        }
        return tree;
    }




}
