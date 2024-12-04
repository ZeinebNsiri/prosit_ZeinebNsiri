import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class AffectationHashMap {
    Map <employé,département> affectation = new HashMap<>();

    public void ajouterEmployeDepartement(employé e, département d){
        affectation.put(e,d);
    }
    public void afficherEmployesEtDepartements(){
        Set<Map.Entry<employé,département>> entrySet = affectation.entrySet();
        System.out.println("liste :"+entrySet);
    }
    public void supprimerEmploye (employé e){
        affectation.remove(e);
    }
    public void supprimerEmployeEtDepartement (employé e, département d){
        affectation.remove(e);
    }
    public void afficherEmployes(){
        Set<employé> KeySet = affectation.keySet();
        System.out.println("liste des employés:"+KeySet);
    }
    public void afficherDepartements(){
        System.out.println("liste des départements:"+affectation.values());
    }
    public boolean rechercherEmploye (employé e){
        return affectation.containsKey(e);
    }
    public boolean rechercherDepartement (département d){
        return affectation.containsValue(d);
    }
    public TreeMap<employé, département> trierMap(){
        TreeMap<employé, département> treeMap = new TreeMap<>();
        for(Map.Entry<employé, département> entry : affectation.entrySet()){
            treeMap.put(entry.getKey(), entry.getValue());
        }
        return treeMap;
    }
}
