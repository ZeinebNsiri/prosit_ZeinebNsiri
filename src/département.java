import java.util.Objects;

public class département implements Comparable<département>{
    private int id;
    private String nom;
    private int nbEmp;

    public département(){};

    public département(int id, String nom, int nbEmp) {
        this.id = id;
        this.nom = nom;
        this.nbEmp = nbEmp;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbEmp() {
        return nbEmp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbEmp(int nbEmp) {
        this.nbEmp = nbEmp;
    }


    @Override
    public String toString() {
        return "département{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmp=" + nbEmp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof département that)) return false;
        return getId() == that.getId() && Objects.equals(getNom(), that.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getNbEmp());
    }

    @Override
    public int compareTo(département o) {
        return this.id - o.id;
    }
}
