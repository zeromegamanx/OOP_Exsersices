package Animal;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract public void greeting();
}
