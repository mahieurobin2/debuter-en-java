//public class Main {
//   public static void main(String[] args) {
//  System.out.println("coucou");
//    String message = "salut";
//    System.out.println(message);
//    int age = 14;
//    if (age >18) {
//        System.out.println("Majeur");
//    } else {
//        System.out.println("Mineur");
//   }
//    for(int i=0; i<14; i++) {
//        System.out.println(i);
//    }
//}
//}

public  class Main {
    public static void main(String[] args){
        System.out.println("Coucou");

        Utilisateur robin = new Utilisateur("MAHIEU", "Robin", 19, CiviliteEnum.MONSIEUR);
        Utilisateur robin2 = robin;
        Utilisateur robin3 = new Utilisateur(robin);
        robin.setAge(19);
        robin.setPrenom("Robin");
        System.out.println(robin);
        System.out.println(robin2);
        System.out.println(robin3);
        System.out.println(robin.isUtilisateurMajeur());
        System.out.println(robin3.isUtilisateurMajeur());
    }
    
}


