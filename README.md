# PersonneCounter

 projet pour comprendre la différence entre une variable `static` et une variable normale.

## Objectif

- `nbInstances` : compteur partagé entre toutes les personnes
- `nbLocal` : compteur propre à chaque personne

## Fonctionnement

Dans le constructeur :
- `nbInstances++` → augmente pour tout le monde
- `nbLocal++` → augmente juste pour l'objet en cours

## Exemple

```java
Personne p1 = new Personne();
Personne p2 = new Personne();
Personne p3 = new Personne();
Personne p4 = new Personne();

System.out.println("(" + p4.nbLocal + ", " + Personne.nbInstances + ")");
