package animal;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Wooooof");
    }

    @Override
    public String toString() {
        return "Animal.Dog[" + super.toString() + "]";
    }
}
