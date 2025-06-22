public class Personne {

    // Compteur partagé par toutes les personnes
    public static int nbInstances;

    // Compteur propre à chaque personne
    public int nbLocal;

    // Constructeur
    public Personne() {
        nbInstances++;
        nbLocal++;
    }
}
