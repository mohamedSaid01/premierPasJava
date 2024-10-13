public class Penguin extends Aquatique{
    public float swimmingDepth;

    public Penguin() {

    }

    public Penguin(String name, String family, int age , boolean isMammal, String habitat, float swimmingDepth){
        super(name, family, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming depth: " + swimmingDepth;
    }
}
