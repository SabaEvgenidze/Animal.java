package Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "soso";

        Dog dog = new Dog();
        dog.name = "jeka";

        Lion lion = new Lion();
        lion.name = "saba";

        Animal a = new Animal();

        a.animal(cat, dog, lion);
    }
}

  
