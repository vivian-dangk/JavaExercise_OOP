
package baitap.Animal;
import java.util.*;
import java.text.*;
public abstract class Animal {
    String id;
    String source;
    Date dateBirth;
    String color;
    public Animal(String id, String source, Date dateBirth, String color){
        this.id=id;
        this.dateBirth=dateBirth;
        this.color=color;
        this.source=source;
    }
    public abstract void makeSound();
    public void display(){
        SimpleDateFormat bd = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: "+id+", Goc: "+source+", date: "+dateBirth+", Mau long: "+color+".");
    }
}
class Dog extends Animal{
    private String breed;
    public Dog(String id, String source, Date dateBirth, String color, String breed){
        super(id, source, dateBirth, color);
        this.breed=breed;
    }
    @Override
    public void makeSound(){
        System.out.println("Gau Gau!!!");
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Giong: "+breed);
    }
}
class Cat extends Animal{
    public Cat(String id, String source, Date dateBirth, String color){
        super(id, source, dateBirth, color);
    }
    @Override
    public void makeSound(){
        System.out.println("Meo Meo!!!");
    }
}
