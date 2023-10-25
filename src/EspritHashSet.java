import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant {
    private HashSet<Enseignant> enseignants ;

    @Override
    public void ajouterEnseignant(Enseignant e) {
this.enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return false;
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        return enseignants.contains(id);
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(this.enseignants);
    }
}
