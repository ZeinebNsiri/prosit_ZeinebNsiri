import java.util.Comparator;
import java.util.Objects;

public class employé implements Comparable<employé> , Comparator<employé> {
    private int id;
    private String nom;
    private String prénom;
    private String nomDep;
    private int grade;

    public employé(){};

    public employé(int id, String nom, String prénom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prénom = prénom;
        this.nomDep = nomDep;
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "employé{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", nomDep='" + nomDep + '\'' +
                ", grade=" + grade +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof employé employé)) return false;
        return getId() == employé.getId() && Objects.equals(getNom(), employé.getNom());
    }


    @Override
    public int compareTo(employé o) {
        return this.id - o.id;
    }

    @Override
    public int compare(employé o1, employé o2) {
        return 1;
    }
}
