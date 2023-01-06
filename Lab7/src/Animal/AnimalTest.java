package Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        System.out.println("Cat's name: " + cat.name);
        System.out.print("Cat's greeting: ");
        cat.greeting();
        System.out.println();

        Dog dog = new Dog("Dog");
        System.out.println("Dog's name: " + dog.name);
        System.out.print("Dog's greeting: ");
        dog.greeting();
        System.out.println();

        Dog anotherDog = new Dog("Another Dog");
        System.out.println("Another dog's name: " + anotherDog.name);
        System.out.print("Another dog's greeting: ");
        anotherDog.greeting(dog);
        System.out.println();

        BigDog dog1 = new BigDog("dog1");
        System.out.println("Dog1's name: " + dog1.name);
        System.out.print("Dog1's greeting: ");
        dog1.greeting();
        System.out.println();

        BigDog dog2 = new BigDog("dog2");
        System.out.println("Another dog's name: " + dog2.name);
        System.out.print("Another dog's greeting: ");
        dog2.greeting(anotherDog);
        System.out.println();

        BigDog dog3 = new BigDog("dog3");
        System.out.println("Dog1's name: " + dog3.name);
        System.out.print("Dog1's greeting: ");
        dog3.greeting(dog1);


    }
}
