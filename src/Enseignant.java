public class Enseignant {
    int id ;
    String nom;
    String prenom;


    public Enseignant(){};
    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
       if (obj==this) return true;
       if (obj==null) return false;
       if (obj.getClass()!=this.getClass())
           return false;

       Enseignant ens =(Enseignant)  obj;
       if (ens.id==id)
           return true;
       return false;
    }







}
