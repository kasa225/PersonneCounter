//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Personne personne1 = new Personne();
        Personne personne2 = new Personne();
        Personne personne3 = new Personne();
        Personne personne4 = new Personne();

        // Affiche les compteurs
        System.out.println("(" + personne4.nbLocal + ", " + Personne.nbInstances + ")");
    }
}
