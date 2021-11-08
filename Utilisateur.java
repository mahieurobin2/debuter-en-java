public class Utilisateur {

    //attributs
    private String nom, prenom;
    private int age;
    private CiviliteEnum  civilite;

    //------------------constructeurs--------------------
    //default
    public Utilisateur(){

    }

    //parametres
    public Utilisateur(String nom, String prenom, int age, CiviliteEnum civilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.civilite = civilite;
    }

    //recopie
    public Utilisateur(Utilisateur user) {
        this.nom = user.getNom();
        this.prenom = user.getPrenom();
        this.age = user.getAge();
        this.civilite = user.getCivilite();
    }
    
    // setters
    public void setNom(String nom) {
        this.nom;
    }
    public void setPrenom(String prenom) {
        this.prenom;
    }
    public void setAge(int age) {
        this.age;
    }
    public void setCivilite(CiviliteEnum civilite) {
        this.civilite;
    }

    //getters
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public int getAge() {
        return this.age;
    }
    public CiviliteEnum getCivilite() {
        return this.civilite;
    } 
    public String toString(){
        return civilite + " " + prenom + " " + nom + " " + age + " ans" ;
    }

    public Boolean isUtilisateurMajeur(int age) {
            return (age >= 18);
    }

    public Boolean isUtilisateurMajeur(int age) {
        return (age == MONSIEUR);
}
}
