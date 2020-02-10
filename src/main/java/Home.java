import java.util.ArrayList;
public class Home {

    ArrayList<Animal> list = new ArrayList<Animal>();

    public void adoptPet(Animal animal) {

        list.add(animal);

    }

    public void makeAllSounds() {

        for (Animal animal : list) {
           animal.sound();

        }

    }
}
