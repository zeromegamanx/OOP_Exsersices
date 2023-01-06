package animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        System.out.println("Animal.Animal: " + animal);

        Mammal mammal = new Mammal("mammal");
        System.out.println("Mammel: " + mammal);

        Cat cat = new Cat("cat");
        System.out.println("Animal.Cat: " + cat);
        System.out.println("Animal.Cat greets: ");
        cat.greets();

        Dog dog = new Dog("dog");
        System.out.println("Animal.Dog " + dog);
        System.out.println("Animal.Dog greets: ");
        dog.greets();
        System.out.println("Another dog greets: ");
        dog.greets(new Dog("doggo"));
    }
}
