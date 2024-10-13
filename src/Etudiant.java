public class Etudiant {

    int id;
    String nom;
    int age;
    boolean isAdmin;

    //constructeur non parametrer
    //public Etudiant(){}

    //constructeur parametrer
    public Etudiant(int id, String name, int age, boolean isAdmin){
        this.id = id;
        nom = name;
        this.age = age;
        this.isAdmin = isAdmin;
    }

    public void displayEtudiant(){
        System.out.println("id :"+ id + nom + age + isAdmin);
    }
}
