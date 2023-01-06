package animal;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Animal.Mammal[" + super.toString() +"]";
    }
}
