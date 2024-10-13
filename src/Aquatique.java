public class Aquatique extends Animal {
    protected String habitat;

    public Aquatique() {
    }
    public Aquatique(String name, String family, int age , boolean isMammal, String habitat)
    {
        super(name, family, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
