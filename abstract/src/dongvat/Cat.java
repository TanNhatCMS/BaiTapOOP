package dongvat;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
    public void run(){
        System.out.println("Cat is running");
    }
}
