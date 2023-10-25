import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Enseignant e1 = new Enseignant(9, "zaineb", "khlifi");
        Enseignant e2 = new Enseignant(10, "hjk", "mlp");
        Enseignant e3 = new Enseignant(11, "hjk", "mlp");

        System.out.println(e1);
        EspritHashSet gestionEnseignantHashSet = new EspritHashSet();
        gestionEnseignantHashSet.ajouterEnseignant(e1);
        gestionEnseignantHashSet.ajouterEnseignant(e2);
        gestionEnseignantHashSet.displayEnseignants();


        GestionEnseignant gestionnaireTreeSet = new EspritTreeSet();
        gestionnaireTreeSet.ajouterEnseignant(e2);
        gestionnaireTreeSet.ajouterEnseignant(e3);
        System.out.println(gestionnaireTreeSet.rechercherEnseignant(new Enseignant(0, "Nom2", "")));
        System.out.println(gestionnaireTreeSet.rechercherEnseignant(2));
        gestionnaireTreeSet.displayEnseignants();

        TreeSet<Enseignant> enseignants = new TreeSet<>();
        enseignants.add(e1);
        enseignants.add(e2);
        enseignants.add(e3);

        for (Enseignant enseignant : enseignants) {
            System.out.println(enseignant);
        }
    }
}