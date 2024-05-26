abstract class Animal {
    abstract void makeSound();

}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("bow bow");
    }

}

class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
    
}

public class Sound {
public static void main(String[] args) {
    Animal[] animals = {new Cat(), new Dog()};
    for(Animal animal:animals) {
        animal.makeSound();
    }
}

    
}

