import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Zoo {
    private Animal[] animaux;
    private String name;
    private String city;
    private final int NBR_CAGES=3;
    private int nbrAnimaux;
    public Zoo(String name, String city)
    {
        this.name=name;
        this.city=city;
        animaux= new Animal[NBR_CAGES];
    }
    public Zoo(){};

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (!Objects.equals(name, " ")) {
            this.name=name;
        }
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void displayZoo()
    {
        System.out.println(name+" "+city+" "+NBR_CAGES);
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", NBR_CAGES=" + NBR_CAGES +
                ", numbre animaux=" + Arrays.toString(animaux) +
                '}';
    }

    public boolean addAnimal(Animal animal)
    {
        if(searchAnimal(animal)!=-1)
            return false;
        if(!isZooFull())
            return false;
        animaux[nbrAnimaux]=animal;
        nbrAnimaux++;
        return true;
    }

    public void afficherAnimaux()
    {
        for(int i=0;i<nbrAnimaux;i++)
            System.out.println(animaux[i]);
    }

    public int searchAnimal(Animal animal)
    {
        for(int i=0;i<nbrAnimaux;i++)
        {
            if(animal.getName()==animaux[i].getName())
                return i;

        }
        return -1;
    }

    public boolean removeAnimal(Animal animal)
    {
        int ind=searchAnimal(animal);
        if(ind==-1)
            return false;
        for(int i=ind;i<nbrAnimaux;i++)
        {
            animaux[i]=animaux[i+1];
        }
        nbrAnimaux--;
        animaux[nbrAnimaux]=null;
        return true;
    }

    public boolean isZooFull(){
        return NBR_CAGES ==  nbrAnimaux;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimaux > z2.nbrAnimaux){
            return z1;
        }
        else{
            return z2;
        }
    }


}
