public class Terrestre extends Animal {
    public int nbrLegs;

    public Terrestre() {

    }

    public Terrestre(String name, String family, int age , boolean isMammal, int nbrLegs)
    {
        super(name, family, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombres des legs: " + nbrLegs;
    }
}
