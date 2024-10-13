public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal(String name, String family, int age , boolean isMammal)
    {
        this.name=name;
        this.family=family;
        this.age=age;
        this.isMammal=isMammal;
    }
    public Animal(){};

    public String getFamily(){
        return family;
    }
    public void setFamily(String family){
        this.family=family;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
    }

    public Boolean getIsMammal(){
        return isMammal;
    }
    public void setIsMammal(Boolean isMammal){
        this.isMammal=isMammal;
    }

    @Override
    public String toString() {
        return "name: "+name+" family: "+family+" age: "+age+" is mammal: "+isMammal;
    }

}
