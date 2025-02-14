
package baitap.Animal;
import java.util.*;
import java.text.*;
public class AnimalList {
    ArrayList<Animal> dongvat = new ArrayList<>();
    public void addDV(Animal animal){
        dongvat.add(animal);
    }
    public void displayall(){
        for(Animal animal: dongvat){
            animal.display();
            animal.makeSound();
        }
    }
}
