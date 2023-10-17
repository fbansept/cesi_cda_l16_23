public class Personne {

    private String nom;
    private String prenom;
    private int age;
    private boolean majeur;

    public boolean isMajeur() {
        return majeur;
    }

//    public void setMajeur(boolean majeur) {
//        this.majeur = majeur;
//    }

    public String getNom() {
        return nom.toUpperCase();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.majeur = age >= 18;
    }
}
