package Animal;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    public void greeting() {
        System.out.println("Wow");
    }

    public void greeting(Dog another) {
        System.out.println("Woooow");
    }

    public void greeting(BigDog another) {
        System.out.println("Woooooooow");
    }
}
