import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le nom du zoo");
        String zooName = scanner.nextLine();
        int nbrCage;
        do {
            System.out.println("Donner le nombre des cages");
            nbrCage = scanner.nextInt();
            if(nbrCage<0){
                System.out.println("Erreur : le nombre des cages doit etre positive");
            }
        } while (nbrCage < 0);
        if (nbrCage == 1){
            System.out.println(zooName + " comporte " + nbrCage + " cage");
        }else {
            System.out.println(zooName + " comporte " + nbrCage + " cages");
        }
    }
}