// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Enseignant e1=new Enseignant(9,"zaineb","khlifi");
        Enseignant e2=new Enseignant(10,"hjk","mlp");
        Enseignant e3=new Enseignant(11,"hjk","mlp");

        System.out.println(e1);
        GestionEnseignant gestionEnseignantHashSet = new EspritHashSet();
        gestionEnseignantHashSet.ajouterEnseignant(e1);
        gestionEnseignantHashSet.ajouterEnseignant(e2);
        System.out.println(gestionEnseignantHashSet);



















    }
}