public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal lion= new Animal();
        Animal lion1= new Animal("karim","mekni",45,true);
        Animal lion2= new Animal("karim","mekni",45,true);
        Animal lion3= new Animal("karim","mekni",45,true);
        Animal lion4= new Animal("xxxx","x",45,true);

        lion.setName("name");
        lion.setFamily("lion");
        lion.setAge(-30);
        lion.setIsMammal(true);

        Zoo myZoo= new Zoo();
        Zoo myZoo2= new Zoo("zoo2","ariana");
        myZoo.setName("belvedere");
        myZoo.setCity("tunis");

        System.out.println(myZoo.getName());
        System.out.println(myZoo.getCity());
        System.out.println(myZoo.getNBR_CAGES());

        System.out.println(lion.getName());
        System.out.println(lion.getFamily());
        System.out.println(lion.getAge());
        System.out.println(lion.getIsMammal());

        System.out.println(myZoo2);
        System.out.println(lion);
        System.out.println("=======>");
        System.out.println(myZoo2.addAnimal(lion));
        System.out.println(myZoo2.addAnimal(lion1));
        System.out.println(myZoo2.addAnimal(lion2));
        System.out.println(myZoo2.addAnimal(lion3));

        myZoo2.afficherAnimaux();
        System.out.println(myZoo2.searchAnimal(lion2));
        System.out.println(myZoo2.searchAnimal(lion4));
        System.out.println(myZoo2.removeAnimal(lion1));
        System.out.println(myZoo2.removeAnimal(lion4));
        System.out.println(myZoo2);

        System.out.println(myZoo2.isZooFull());

        System.out.println("zoo contient plus grand nombres d'animeaux : " + Zoo.compareZoo(myZoo,myZoo2));





        Dolphin dolphin = new Dolphin("Flipper", "Dolphinidae", 8, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Pingu", "Spheniscidae", 5, false, "Antarctica", 100.0f);
        Aquatique aquatique = new Aquatique("Generic Fish", "Pisces", 2, false, "River");
        Terrestre terrestre = new Terrestre("Elephant", "Elephantidae", 15, true, 4);

        System.out.println("Dolphin: " + dolphin);
        System.out.println("Penguin: " + penguin);
        System.out.println("Aquatique: " + aquatique);
        System.out.println("Terrestre: " + terrestre);

        dolphin.swim();
        penguin.swim();
        aquatique.swim();

        System.out.println("Dolphin: " + dolphin);
        System.out.println("Penguin: " + penguin);
        System.out.println("Aquatic: " + aquatique);

    }
}