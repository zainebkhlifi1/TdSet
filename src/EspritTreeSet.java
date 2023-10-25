import java.util.TreeSet;

public class EspritTreeSet implements  GestionEnseignant{
    TreeSet<Enseignant> enseignants;
    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);

    }

    @Override
    public void displayEnseignants() {
        System.out.println(enseignants);
    }
}
