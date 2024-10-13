public class Dolphin extends Aquatique{
    public float swimmingSpeed;

    public Dolphin() {

    }

    public Dolphin(String name, String family, int age , boolean isMammal, String habitat, float swimmingSpeed){
        super(name, family, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming speed: " + swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
